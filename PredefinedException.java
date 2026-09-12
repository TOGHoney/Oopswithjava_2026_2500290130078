
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class PredefinedException{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int[] arr = {1, 2, 3, 4};
            int i ,b;
            FileReader fr = new FileReader("abc.text");
            i = sc.nextInt();
            b = sc.nextInt();
            System.out.println(arr[i]);
            System.out.println(arr[i]/b);
        }catch(FileNotFoundException e){
            System.out.println("Exception caught:" + e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Exception caught:"+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: "+e.getMessage());
        }finally{
            System.out.println("program ended");
            sc.close();
        }
    }
}