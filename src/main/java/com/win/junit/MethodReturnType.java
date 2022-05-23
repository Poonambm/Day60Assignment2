package com.win.junit;


public class MethodReturnType{
    public static void main(String[] args) {
       System.out.println(returnString());
       System.out.println(returnNumber());
       System.out.println(returnBoolean());
       
    }
    public static String returnString() {
        return "String of text";
    }
    public static int returnNumber() {
        return 5;
    }
    public static boolean returnBoolean() {
        return true;
    }
}


