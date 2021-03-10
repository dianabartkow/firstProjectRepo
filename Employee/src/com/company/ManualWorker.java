package com.company;

public class ManualWorker extends Employee {

    private int strength;

    public ManualWorker() {
        super();
    }

    public ManualWorker(Long iD, String name, String surname, int age, int experience, String city, String streetName, int numberOfLocal, int numberOfBulding, int strength) {
        super(iD, name, surname, age, experience, city, streetName, numberOfLocal, numberOfBulding);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "ManualWorker{" +
                "strength=" + strength +
                '}';
    }

    @Override
    public double workerValue() {
        return super.getExperience()*(this.strength/super.getAge());
    }

}
