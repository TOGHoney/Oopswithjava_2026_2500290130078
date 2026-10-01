import java.util.ArrayList;
import java.util.Comparator;
import java.lang.Math;
public class Sorting3 {
    public static void main(String[] args) {
        ArrayList<Book>b = new ArrayList<>();
        b.add(new Book(1, 78, "b1"));
        b.add(new Book(2, 80, "b2"));
        b.add(new Book(3, 60, "b3"));
        b.add(new Book(4, 60, "b4"));
        b.sort(new BookComparator());
        System.out.println(b);
    }
}

class Book{
    int bookid, np;
    String name;
    Book(int bid, int np, String name){
        bookid = bid;
        this.np = np;
        this.name = name;
    }
    @Override
    public String toString() {
        return bookid+" "+name+" "+np;
    }
}

class BookComparator implements Comparator<Book>{
    public int compare(Book b1, Book b2){
        if(b1.np == b2.np){
            for(int i=0;i<Math.min(b1.name.length(), b2.name.length());i++){
            char a = b1.name.charAt(i), b = b2.name.charAt(i);
            int d = a-b;
            if(d!=0) return d;
            }
            return -1;  
        }else{
            return b1.np-b2.np;
        }
    }
}