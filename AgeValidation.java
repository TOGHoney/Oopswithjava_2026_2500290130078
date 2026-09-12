import java.util.Scanner;
public class AgeValidation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            checkAge(a);
        }catch(AgeInvalidException e){
            System.out.prinln(e);
        }finally{
            System.out.println("Program ended");
        }
    }
    void checkAge(int age) throws AgeInvalideException {
        if(age<18) throw new AgeInvalidException("Ageis not valid to vote");
        System.out.println("Eligible to vote");
    }
}

class AgeInvalidException extends RuntimeException{
    AgeInvalidException(String msg){
        super(msg);
    }
}