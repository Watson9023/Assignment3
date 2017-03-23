package com.watson.interfaces;

import java.util.*;
/**
 * Created by Long on 3/22/2017.
 */
public class RunCalculator {

    public static void main(String[] args) {
        Calculator cal = new CalculatorImplement();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first integer: ");
        float int1 = input.nextInt();
        System.out.println("Please enter the first integer: ");
        float int2 = input.nextInt();
        input.close();
        System.out.println("Addition Result: " + cal.add(int1, int2));
        try{
            System.out.println("Division Result: " + cal.divide(int1, int2));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Multiplication Result: " + cal.multiply(int1, int2));
        if(int1 >= int2)
        {
            System.out.println("Subtraction Result: " + cal.subtract(int1, int2));
        }
        else
        {
            System.out.println("Subtraction Result: Error; second integer too Big");
        }
    }
}
