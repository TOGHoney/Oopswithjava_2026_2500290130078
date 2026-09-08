public class Overriding {
    public static void main(String[] args){
        Shape obj = new Circle(20);
        obj.area();
    }
    class Shape{
        void area(){}
    }
    class Rectangle extends Shape{
        int l, b;
        void area(){
            System.out.printf("%d\n", l*b);
        }
        Rectangle(int l, int b){
            this.l = l;
            this.b = b;
        }

    }
    class Cirle{
        int r;float area;
        void area(){
           System.out.printf("%d\n", r*r*(22/7)); 
        }
        System.out.printf("%f", area);
        Circle(int r){
            this.r=r;
        }
    }
}