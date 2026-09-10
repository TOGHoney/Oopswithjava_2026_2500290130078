import java.util.Scanner;
public class ExceptionHandling{
    Scanner obj = new Scanner(System.in);
    int arr[] = {1, 2, 3};
    int i = obj.nextInt();
    try{
        System.out.println(arr[i]);
        int a = obj.nextInt();
        System.out.prinln(arr[i]/a);
    }catch(Exception a){
        a.printStackTrace();
    } finally {
        System.out.println("program finished");
    }
}