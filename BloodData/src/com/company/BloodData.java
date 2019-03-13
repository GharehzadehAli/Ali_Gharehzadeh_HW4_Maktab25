package com.company;

public class BloodData {
    private String bloodType;
    private String rhFactor;
    public BloodData(){
        this.bloodType="O";
        this.rhFactor="+";
    }
    public BloodData(String bloodType,String RhFactor){
        this.bloodType=bloodType;
        this.rhFactor=RhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
}
