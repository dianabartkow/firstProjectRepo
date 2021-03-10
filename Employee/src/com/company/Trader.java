package com.company;

public class Trader extends Employee{

     Effectiveness effectiveness;


    public Trader() {
        super();
    }

    public Trader(Long iD, String name, String surname, int age, int experience, String city, String streetName, int numberOfLocal, int numberOfBulding, Effectiveness effectiveness) {
        super(iD, name, surname, age, experience, city, streetName, numberOfLocal, numberOfBulding);
        this.effectiveness = effectiveness;
    }

    public Effectiveness getEffectiveness() {
        return effectiveness;
    }

    public void setEffectiveness(Effectiveness effectiveness) {
        this.effectiveness = effectiveness;
    }


    @Override
    public String toString() {
        return "Trader{" +
                "effectiveness=" + effectiveness +
                '}';
    }

    @Override
    public double workerValue() {
        return getExperience()* effectiveness.getLevel();
    }

}
