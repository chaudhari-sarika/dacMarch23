/*Create a class named "ElectricityBill" that has the following instance variables:
a. customerName (String)
b. unitsConsumed (double)
c. billAmount (double)
Create a constructor that initializes the customerName and unitsConsumed instance
variables.
Define a method named "calculateBillAmount" that calculates the bill amount based 
on the number of units consumed. The formula for calculating the bill amount is:
a. For the first 100 units: Rs. 5 per unit
b. For the next 200 units: Rs. 7 per unit
c. For the remaining units: Rs. 10 per unit
Implement the "calculateBillAmount" method in the "ElectricityBill" class.
Define a main method that creates an object of the "ElectricityBill" class and sets the 
customerName and unitsConsumed instance variables. Then, call the 
"calculateBillAmount" method to calculate the bill amount and display the 
customerName, unitsConsumed, and billAmount */


package p1;

class ElectricityBill{
	   /*
	       a. customerName (String)
	       b. unitsConsumed (double)
	       c. billAmount (double)
	   */
	    private String customerName;
	    private double unitsConsumed;
	    private double billAmount;
	  
	   ElectricityBill(String customerName,double unitsConsumed){
	    this.customerName=customerName;
	    this.unitsConsumed=unitsConsumed;
	   }
	    
	    public void calculateBillAmount(){
	        double units=this.unitsConsumed;
	        if(units>100) {
	           this.billAmount= 5*100;
	           units-=100;
	        }else units=units*5;
	        if(units>200){
	            units-=200;
	        }else units*=7;
	        if(units>0){
	            this.billAmount= 10*units;
	        }
	     
	    }


	    public String toString(){
	        return "Customer Name :" + customerName+"\n"
	               +"Units Consumed :" + unitsConsumed+"\n"
	               +"_Total Bill: "  +billAmount;
	    }
	}
