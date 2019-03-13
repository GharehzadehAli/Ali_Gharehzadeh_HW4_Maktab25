package com.company;

public class Patient {
private int ID;
private int age;
private BloodData bloodData;
public Patient(){
    this.ID=0;
    this.age=0;
    this.bloodData=new BloodData();
}
public Patient(int ID,int age,BloodData bloodData){
    this.ID=ID;
    this.age=age;
    this.bloodData=bloodData;
}

    public BloodData getBloodData() {
        return this.bloodData;
    }

    public int getAge() {
        return this.age;
    }

    public int getID() {
        return this.ID;
    }
}
