package com.win.junit;

public class AverageMethod {
    public static void main(String[] args) {
      
             System.out.println("The average is: "+ average(2,5,8));
              
    }
    public static int sum(int num1, int num2, int num3) {
           return (num1 + num2 + num3);
    }
    public static double average(int num1, int num2, int num3) {
      int Total = sum(num1, num2, num3);
              double average = Total/ 3.0;
            return average;
    }
   
   
}
