package com.company;

public class OfficeWorker extends Employee {

    private int OfficeId;
    private int iQ;

    public OfficeWorker() {
        super();
    }

    public OfficeWorker(Long iD, String name, String surname, int age, int experience, String city, String streetName, int numberOfLocal, int numberOfBulding, int officeId, int iQ) {
        super(iD, name, surname, age, experience, city, streetName, numberOfLocal, numberOfBulding);
        OfficeId = officeId;
        this.iQ = iQ;
    }

    public OfficeWorker(int officeId, int iQ) {
        OfficeId = officeId;
        this.iQ = iQ;
    }

    public int getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(int officeId) {
        OfficeId = officeId;
    }

    public int getiQ() {
        return iQ;
    }

    public void setiQ(int iQ) {
        this.iQ = iQ;
    }

    @Override
    public String toString() {
        return "OfficeWorker{" +
                "OfficeId=" + OfficeId +
                ", iQ=" + iQ +
                '}';
    }

    @Override
    public double workerValue() {
        return super.getExperience()*iQ;
    }

}
