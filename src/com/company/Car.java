package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Main.mainMenu;

public class Car extends Vehicle {

    private Scanner input = new Scanner(System.in);

    private int speed = 0;
    private int ges = 100;

    public Car() {

        setMake();
        setModel();
        setYear();
        setSpeed(0);
        setGes(100);

    }


    public void setYear() {
        System.out.println("What is the year of the car you would like to make?");
        try {
            super.setYear(input.nextInt());
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number for the year");
            setYear();
        }
    }


    public void setMake() {
        System.out.println("What is the make of car you would like?");
        super.setMake(input.nextLine());
    }


    public void setModel() {
        System.out.println("What is the model of car you would like?");
        super.setModel(input.nextLine());
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void setGes(int ges) {
        this.ges = ges;
    }

    public Scanner getInput() {
        return input;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGes() {
        return ges;
    }

    public void getCarInfo() {
        System.out.println("The current car is a " + getMake() + " " + getModel() + ". It is going " + getSpeed() + " MPH and has " + getGes() + "% of it's gas left.");
    }

    public void driveCar(Car car) {

        for (int seconds = 0; seconds <= 5; seconds++) {

            car.setSpeed(car.getSpeed() + 1);
            car.setGes(car.getGes() - 1);

            System.out.println("The " + car.getMake() + " " + car.getModel() + " is going " + car.getSpeed() + "Mph and has " + car.getGes() + "% of it's gas left.");
        }
        mainMenu.menu(car);
    }

    public void undriveCar(Car car) {

        for (int seconds = 0; seconds <= 5; seconds++) {

            car.setSpeed(car.getSpeed() - 1);
            car.setGes(car.getGes() - 1);

            System.out.println("The " + car.getMake() + " " + car.getModel() + " is going " + car.getSpeed() + "MPH and has " + car.getGes() + "% of it's gas left.");
        }
        mainMenu.menu(car);
    }

    public void addGas(Car car) {

        car.setGes(100);
        System.out.println("Your " + car.getMake() + " " + car.getModel() + " now has a full tank!");

    }
}
