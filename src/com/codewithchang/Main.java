package com.codewithchang;

public class Main {
    public static final double PI = Math.PI;

    public static void main(String[] args) {
        System.out.println(area(5));
    }

   public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }
        return (radius * radius) * PI;
   }
}
