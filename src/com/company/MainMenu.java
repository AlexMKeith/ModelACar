package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input = new Scanner(System.in);

    protected void createCar() {

        Car car = new Car();
        car.getCarInfo();

        menu(car);

    }

    public void menu (Car car) {

        System.out.println("What would like to do with the " + car.getMake() + " " + car.getModel() + "?");
        System.out.println("1. Accelerate \n2. Decelerate \n3. Fill up with gas \n4. Exit");

        try {
            switch (input.nextInt()) {
                case 1:
                    car.driveCar(car);
                    break;
                case 2:
                    car.undriveCar(car);
                    break;
                case 3:
                    car.addGas(car);
                    break;
                case 4:
                    System.exit(0);
                    break;
                    default:
                        System.out.println("Please enter a number between 1 and 4.");
                        menu(car);
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number between 1 and 4.");
            menu(car);
        }

    }

}
