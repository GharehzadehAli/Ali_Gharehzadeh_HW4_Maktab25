package com.company;

public class FromLetterWriter {
    public static void displaySalutation(String lastName){
        System.out.println("Dear Mr. or Ms. "+lastName+" Thank you for your recent order.");
    }
    public static void displaySalutation(String firstName,String lastName){
        System.out.println("greeting Dear "+firstName+" "+lastName+" Thank you for your recent order.");
    }
    public static void main(String[] args) {
	// write your code here
        displaySalutation("Gharehzadeh");
        displaySalutation("Ali","Gharehzadeh");
    }
}
