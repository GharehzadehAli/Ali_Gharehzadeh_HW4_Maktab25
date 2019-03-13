package com.company;

public class Billing {
    public static double computeBill(double price) {
        double tax=8.0 / 100 * price;
        double total = price + tax;
        return total;
    }
    public static double computeBill(double price,int quantity) {

        double total_price=price*quantity;
        double tax= 8.0 / 100 * total_price;
        double total = total_price +tax;
        return total;
    }


    public static void main(String[] args) {
        // write your code here
    }
}
