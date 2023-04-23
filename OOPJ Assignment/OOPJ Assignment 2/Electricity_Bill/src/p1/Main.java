package p1;

import java.util.Scanner;

class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
       System.out.println("------ Generate Bill -----");
       System.out.println("Enter customers name");
       String custName=sc.nextLine();
       System.out.println("Enter how much units used by "+custName);
        double unitsConsumed=sc.nextDouble();
       ElectricityBill myBill= new ElectricityBill(custName, unitsConsumed);
       myBill.calculateBillAmount();
       System.out.println(myBill);

    }
}
