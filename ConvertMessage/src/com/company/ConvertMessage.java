package com.company;

import java.util.Scanner;

public class ConvertMessage {
    Scanner scanner = new Scanner(System.in);
    private String message;
    private int code;

    public void getMessage() {
        System.out.println("Enter the message");
        this.message = scanner.nextLine();

    }

    public void getCode() {
        do {
            System.out.println("Enter a number more than -1");
            this.code = scanner.nextInt();
        }
        while (this.code < 0);
    }

    public char encrypt(char letter) {
        char new_char = (char) (this.code + (int) letter);
        // System.out.println(new_char);
        return new_char;

    }

    public void encryptAll() {

        getMessage();
        char[] chars;
        chars = this.message.toCharArray();
        getCode();

        for (int i = 0; i < this.message.length(); i++) {
            if (chars[i] != ' ') {
                chars[i] = encrypt(chars[i]);


            }
        }
        System.out.println(chars);
    }
}
