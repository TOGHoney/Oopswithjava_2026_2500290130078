abstract class Shape{
    abstract double area();
    void displayArea(){
        System.out.println("Areas - " + area());
    }
}

class Rectangle extends Shape{
    double len;
    double width;
    Rectangle(double l, double w){
        this.len = l;
        this.width = w;
    }
    double area(){
        return len*width;
    }
}

class Circle extends Shape{
    double rad;
    Circle(double r){
        this.rad = r;
    }
    double area(){
        return 22/7*r*r;
    }
}
public class UseCase2 {
    public static void main(String[] args) {
        Shape shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
 
        for (Shape s : shapes) {
            s.displayArea();   
        }
    }
}
