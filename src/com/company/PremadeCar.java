package com.company;

public class PremadeCar extends Car {

    private String color;

    public PremadeCar(int year, String make, String model, int speed, int ges, String color) {
        super(year, make, model, speed, ges);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected void getPremadeCarInfo(){

        System.out.println("You are driving a " + getColor() + " " + getYear() + " " + getMake() + " " + getModel() + " It is going " + getSpeed() + "MPH with " + getGes() + "% of it's gas left.");
    }
}
