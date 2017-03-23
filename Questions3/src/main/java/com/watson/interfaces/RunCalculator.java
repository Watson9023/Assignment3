package com.watson.interfaces;

import java.util.*;
/**
 * Created by Long on 3/22/2017.
 */
public class RunCalculator {

    public static void main(String[] args) {
        Calculator calc = new CalculatorImplement();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1 = input.nextInt();
        System.out.println("Enter the first number: ");
        float num2 = input.nextInt();
        input.close();
        System.out.println("Addition Result: " + calc.add(num1, num2));
        try{
            System.out.println("Division Result: " + calc.divide(num1, num2));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Multiplication Result: " + calc.multiply(num1, num2));
        if(num1 >= num2)
        {
            System.out.println("Subtraction Result: " + calc.subtract(num1, num2));
        }
        else
        {
            System.out.println("Subtraction Result: Error; second number too large");
        }
    }

}
