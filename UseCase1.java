public class UseCase1{
    public static void main(String[] args){
        Book book1 = new Book("Java Basics", "J. Author", 350.0, "ISBN001");
        Book book2 = new Book("OOP Concepts", "K. Writer", 420.0, "ISBN002");
        System.out.println(book1.getTitle() + " by " + book1.getAuthor());
        System.out.println("Price: "+book2.getPrice());
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
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String a){
        this.author = a;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double p){
        this.price = p;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setISBN(String i){
        this.ISBN = i;
    }
}