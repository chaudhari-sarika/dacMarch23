/*Write a program to find minimum and maximum number as well as 
to add two double numbers using methods of Double.*/

import java.util.*;

class Question30{
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers for addition and get max and min value ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double sum = Double.sum( a, b);
        double min = Math.min(a, b);
        double max = Math.max( a, b);
        System.out.println("sum of two double numbers "+sum);
        System.out.println("minimum number "+ min);
        System.out.println("maximum number "+ max);

    }
}