package com.bridglabz.JUnitTestingProgramsDay6;

import java.util.Scanner;

public class JUnitTestingProgramsDay6 {
    public static void main(String[] args) {
        temperatureConversion();
    }
    public static void temperatureConversion(){
        System.out.println("Enter the temperature in Celsius:");
        Scanner sc=new Scanner(System.in);
        float Celsius=sc.nextFloat();
        System.out.println("Enter the temperature in Fahrenheit: ");
        float Fahrenheit=sc.nextFloat();
        Fahrenheit=((Celsius*9)/5)+32;
        System.out.println("Temperature in Fahrenheit: "+Fahrenheit);
        System.out.println("Temperature in Celsius :"+Celsius);
    }
}
