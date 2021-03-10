package com.company;

public abstract class Employee {
    private Long iD;
    private String name;
    private String Surname;
   private int age;
   private int experience;
    private String city;
    private String streetName;
    private int numberOfLocal;
    private int numberOfBulding;


    public Employee(Long iD, String name, String surname, int age, int experience, String city, String streetName, int numberOfLocal, int numberOfBulding) {
        this.iD = iD;
        this.name = name;
        Surname = surname;
        this.age = age;
        this.experience = experience;
        this.city = city;
        this.streetName = streetName;
        this.numberOfLocal = numberOfLocal;
        this.numberOfBulding = numberOfBulding;
    }

    public Employee() {
    }

    public Long getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public String getCity() {
        return city;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getNumberOfLocal() {
        return numberOfLocal;
    }

    public int getNumberOfBulding() {
        return numberOfBulding;
    }

    public void setiD(Long iD) {
        this.iD = iD;
    }

    public void setNumberOfLocal(int numberOfLocal) {
        this.numberOfLocal = numberOfLocal;
    }

    public void setNumberOfBulding(int numberOfBulding) {
        this.numberOfBulding = numberOfBulding;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", numberOfLocal=" + numberOfLocal +
                ", numberOfBulding=" + numberOfBulding +
                '}';
    }

    public  abstract double workerValue();
}
