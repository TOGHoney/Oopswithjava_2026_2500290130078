public class UseCase1{
    public static void main(String[] args){
        Book book1 = new Book("Java Basics", "J. Author", 350.0, "ISBN001");
        Book book2 = new Book("OOP Concepts", "K. Writer", 420.0, "ISBN002");
        System.out.println(b1.getTitle()+"by"+b1.getAuthor());
        System.out.println("Price: "+b2.getPrice());
        System.out.println("Library: " + Book.libraryName );
        System.out.println("Total Books added: "+Book.bookcount);

    }
}
class Book{
    private String title;
    private String author;
    private double price;
    private String ISBN;
    static int bookcount=1;
    final static String libraryName = "Sunrise Public Library";
    Book(String t, String a, double p, String i){
        this.title=t;
        this.author=a;
        this.price=p;
        this.ISBN=i;
        ++bookcount;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        this.author = t;
    }
    public String getauthor(){
        return author;
    }
    public void setauthor(String a){
        this.author = a;
    }
    public double getprice(){
        return price;
    }
    public void setTitle(double p){
        this.price = p;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setISBN(String i){
        this.ISBN = i;
    }
}