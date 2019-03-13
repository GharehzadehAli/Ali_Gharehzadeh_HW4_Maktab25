package com.company;

public class TestBloodData {

    public static void main(String[] args) {
	// write your code here
        BloodData bloodData=new BloodData();
        System.out.println(bloodData.getBloodType());
        System.out.println(bloodData.getRhFactor());
        BloodData bloodData1=new BloodData("AB","-");
        System.out.println(bloodData1.getBloodType());
        System.out.println(bloodData1.getRhFactor());
    }
}
