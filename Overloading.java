public class Overloading{
    public static void main(String[] args){
        Addition ob = new Addition();
        ob.sum();
        ob.sum(4,9);
        ob.sum(5.3, 8.7);
    }

    class Addition{
        void sum(){
            System.out.printf("Additon\n");
        }
        void sum(int a, int b){
            System.out.printf("%d\n", a+b);
        }

        void sum(float a, float b){
            System.out.printf("%d\n", a+b);
        }
    }
}