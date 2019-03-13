package com.company;

public class Billing {
    public static double computeBill(double price) {
        double tax=8.0 / 100 * price;
        double total = price + tax;
        System.out.println(total);
        return total;
    }
    public static double computeBill(double price,int quantity) {

        double total_price=price*quantity;
        double tax= 8.0 / 100 * total_price;
        double total = total_price +tax;
        System.out.println(total);
        return total;
    }
    public static double computeBill(double price,int quantity,double coupon) {

        double total_price=price*quantity;
        double final_price=total_price-total_price*coupon/100;
        double tax= 8.0 / 100 * final_price;
        double total = final_price +tax;
        System.out.println(total);
        return total;
    }



    public static void main(String[] args) {
        // write your code here
        computeBill(50);
        computeBill(50,5);
        computeBill(50,5,20);
        
    }
}
