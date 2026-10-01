import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account a1 =
            new Account(101, 1000);

        bank.addAccount(a1);

        Thread atm1 = new Thread(new ATM(a1));
        Thread atm2 = new Thread(new ATM(a1));

        atm1.start();
        atm2.start();
    }

}

class Bank{
    ArrayList<Account>bank = new ArrayList<>();
    void addAccount(Account a){
        bank.add(a);
    }
    synchronized void withdraw(int amount, Account a){
        int i = bank.indexOf(a);
        Account acc = bank.get(i);
        if(acc.balance>amount){
            acc.balance-=amount;
        }else{

        }
    }
    synchronized void deposit(int amount, Account a){
        
    }
}
class Account{
    int accId, balance;
    Account(int accId, int balance){
        this.accId = accId;
        this.balance = balance;
    }
}

class ATM implements Runnable{
    Bank b1;
    ATM(Bank b1){
        this.b1 = b1;
    }
    public void run(){

    }
}