class SynchronisedThread{
    public static void main(String[] args) throws InterruptedException{
        BankAccount acc = new BankAccount();
        WithdrawThread w = new WithdrawThread(acc);
        DepositThread d = new DepositThread(acc);
        Thread thread1 = new Thread(w, "Customer");
        Thread thread2 = new Thread(d, "Bank");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
class BankAccount{
    private int balance = 500;
    synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+"is trying to withdraw "+amount);
        while(balance<amount){
            System.out.println("insufficient balance waiting..");
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        balance = balance-amount;
        System.out.println("withdrawl successful");
        System.out.println("Balance: "+ balance);
    }

    synchronized void deposit(int amount){
        try{
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+ " is depositing "+ amount);
        balance-=amount;
        System.out.println("Deposit successful");
        System.out.println("Balance "+ balance);
        notify();
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class WithdrawThread implements Runnable{
    BankAccount acc;
    WithdrawThread(BankAccount account){
        this.acc = account;
    }

    public void run(){
        acc.withdraw(700);
    }
}

class DepositThread implements Runnable{
    BankAccount acc;
    DepositThread(BankAccount account){
        this.acc = account;
    }
    public void run(){
        acc.deposit(500);
    }
}