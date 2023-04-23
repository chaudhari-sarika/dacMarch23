package Main;

import java.util.Scanner;

import Domain.Dish;
class Restaurant{
	Dish []arr ;
	static Scanner sc = new Scanner(System.in);
	public Restaurant() {
		this.arr = new Dish[10];
	}
	public void AddDish(Dish d ) {
		for(int i=0;i<this.arr.length;i++) {
			if(arr[i]==null) {
				arr[i]=d;
				return;
			}
		}
		System.out.println("Menu list is full !!!!");
		
	}
	public void ShowAllDishes() {
		for(Dish dish : arr) {
			if(dish!=null) {
				System.out.println(dish);
			}
		}
	}
	public void removedish(String DishName) {
		for(int i=0;i< arr.length;i++) {
			if(arr[i]!=null && arr[i].getDishName().equals(DishName) ) {
				arr[i]=null;
				return;
			}
			System.out.println("Menu dish with entered name not found !!!");
		}
		
	}
	public void updatePrice(String DishName) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null && arr[i].getDishName().equals(DishName))
			{
				System.out.println("Enter new price for "+arr[i].getDishName());
				arr[i].setPrice(sc.nextDouble());
			}
		}
		
	}

	
	
	
	
	
}
