package com.company;

public class ConvertMessage {
    private static String input_string;
    private static int input_int;

    public char encrypt(char letter) {
        char new_char = (char) (input_int + (int) letter);
        return new_char;
    }

    public String encryptAll(String input_string){
        char[] chars=new char[input_string.length()];
        for (int i=0;i<input_string.length();i++){
            if(chars[i]!=' '){
                chars[i]=encrypt(chars[i]);
            }
        }
        String new_string=chars.toString();
        return new_string;
    }
}
