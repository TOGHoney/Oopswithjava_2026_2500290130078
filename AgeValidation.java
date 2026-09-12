import java.util.Scanner;
public class AgeValidation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            checkAge(age);
        }catch(AgeInvalidException e){
            System.out.println(e);
        }finally{
            System.out.println("Program ended");
        }
    }
    static void checkAge(int age) throws AgeInvalidException {
        if(age<18) throw new AgeInvalidException("Ageis not valid to vote");
        System.out.println("Eligible to vote");
    }
}

class AgeInvalidException extends RuntimeException{
    AgeInvalidException(String msg){
        super(msg);
    }
}