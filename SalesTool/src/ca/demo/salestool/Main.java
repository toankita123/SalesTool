package ca.demo.salestool;

public class Main {
	public static void main(String args[]){
		SalesData data=new SalesData();
		displayGreeting();
		data.dispaly();
	}

	private static void displayGreeting(){
		System.out.println("Hello Happy Sales People");
		System.out.println("This app shows sales data");
	}
}
