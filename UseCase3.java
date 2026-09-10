Interface Rentables{
    static double Tax_rate = 0.05;
    double calculateRent(int days);
}

class Car implements Rentable{
    static int totalRent=0;
    public double calculateRent(int days){
        totalRent++;
        return 1500*days;
    }
}

class Bike implements Rentable{
    public double calculateRent(int days){
        Car.totalRent++;
        return 500*days;
    }
}

public class UseCase3{
    public static void main(Stirng[] args){
        Rentable car = new Car();
        Rentable bike = new Bike();

        double carRent = car.calculateRent(3);
        double bikeRent = bike.calculateRent(2);

        System.out.println("Car rent include tax:"+(carRent+carRent*CarTax_rate));
        System.out.println("Bike rent include tax:"+(bikeRent+bikeRent*BikeTax_rate));
        System.out.println("Car rent include tax:"+(car.totalRent));

    }
}