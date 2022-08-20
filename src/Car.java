import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car implements CarInterface{

    Scanner scanner=new Scanner(System.in);
    List<Car>cars=new ArrayList<>();
    String brand;
    String name;
    int price;

    public Car() {
    }

    public Car(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    @Override
    public void addCar() {
        System.out.print("Brand: ");
        String brand= scanner.next();
        System.out.print("Name: ");
        String name= scanner.next();
        System.out.print("Price: ");
        int price= scanner.nextInt();

        System.out.println("Success!!!");
        cars.add(new Car(brand,name,price));
    }

    @Override
    public void listCar() {
        for (Car i:cars) {
            System.out.println("||"+i.brand+" "+i.name+" "+i.price);
        }
    }

    @Override
    public void searchCar() {
        System.out.print("Enter a name of car: ");
        String nameCar= scanner.next();

        for (Car i:cars) {
            if (i.name.equals(nameCar)){
                System.out.println("||"+i.brand+" "+i.name+" "+i.price);
            }else {
                System.out.println("There is no available car that you searched.");
            }
        }
    }
    int res=0;
    @Override
    public void bookCar() {
        System.out.println("Welcome to the booking office");
        System.out.println();
        System.out.print("Enter a name of the cars: ");
        String bookName= scanner.next();
        for (Car i: cars){
            if (i.name.equals(bookName)){
                System.out.println("There are 11 cars that you booked car's type ");
                System.out.println();
                System.out.print("Pls, Enter the number of cars: ");
                int numCars= scanner.nextInt();
                if(numCars<=11) {
                    for (Car j : cars) {
                        res = numCars * j.price;
                    }
                    System.out.println(numCars + " " + "cars' price  " + "=" + res);
                    System.out.println();
                }else {
                    System.out.println("There are not "+numCars+" "+"cars ");
                }
            }else {
                System.out.println("There is not any "+bookName+" "+"car sort");
            }
        }
    }
}
