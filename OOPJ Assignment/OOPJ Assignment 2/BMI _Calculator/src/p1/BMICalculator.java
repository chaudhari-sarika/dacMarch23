package p1;

public class BMICalculator {
	
	private double height;
	private double weight;
	
	public BMICalculator() {
		this.height =0;
		this.weight=0;
	}
	
	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double calculateBMI() {
		return this.weight /((this.height*this.height)/1000);
	}
}

	


	

		
	
