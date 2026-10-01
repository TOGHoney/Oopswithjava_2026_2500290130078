import java.util.ArrayList;
import java.util.Comparator;
import java.lang.Math;
public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Product>p = new ArrayList<>();
        p.add(new Product(1, 78, "p1"));
        p.add(new Product(2, 80, "p2"));
        p.add(new Product(3, 60, "p3"));
        p.add(new Product(4, 60, "p4"));
        p.sort(new PriceComparator());
        System.out.println(p);
    }
    

}
class Product{
    int productID, price;
    String name;
    Product(int pid, int p, String n){
        productID = pid;
        price = p;
        name = n;
    }
    @Override
    public String toString() {
        return name+" "+price;
    }
}
class PriceComparator implements Comparator<Product>{
    public int compare(Product p1, Product p2){
        if(p1.price==p2.price){
            for(int i=0;i<Math.min(p1.name.length(), p2.name.length());i++){
            char a = p1.name.charAt(i), b = p2.name.charAt(i);
            int d = a-b;
            if(d!=0) return d;
            }
            return -1;
        }else{
            return p1.price-p2.price;
        }
    }
}