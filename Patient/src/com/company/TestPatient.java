package com.company;

public class TestPatient {

    public static void main(String[] args) {
	// write your code here
        Patient patient=new Patient();
        System.out.println(patient.getAge());
        System.out.println(patient.getBloodData().getBloodType());
        System.out.println(patient.getBloodData().getRhFactor());
        System.out.println(patient.getID());
        BloodData bloodData=new BloodData("A","-");
        Patient patient1=new Patient(1,20,bloodData);
        System.out.println(patient1.getID());
        System.out.println(patient1.getAge());
        System.out.println(patient1.getBloodData().getRhFactor());
        System.out.println(patient1.getBloodData().getBloodType());
    }
}
