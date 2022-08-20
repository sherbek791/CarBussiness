import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(in);
        Car car=new Car();
        while (true){
            System.out.println("Add cars->[1]");
            System.out.println("List cars->[2]");
            System.out.println("Search cars->[3]");
            System.out.println("Book cars->[4]");
            System.out.print("= ");
            int n= scanner.nextInt();

            switch (n){
                case 1->{
                    car.addCar();
                }
                case 2->{
                    car.listCar();
                }
                case 3->{
                    car.searchCar();
                }
                case 4->{
                    car.bookCar();
                }
            }
        }


    }
}