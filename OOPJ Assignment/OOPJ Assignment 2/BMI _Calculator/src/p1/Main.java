package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		BMICalculator bmi = new BMICalculator(); 
		System.out.println("Enter height in m :  ");
		double height = sc.nextFloat();
		bmi.setHeight(height);
		System.out.println("Enter weight in kg :  ");
		double weight = sc.nextFloat();
		bmi.setWeight(weight);
	   double BMI1 = bmi.calculateBMI();
	   System.out.println("BMI of your body is :  "+BMI1);
	
		
		
	}

}

