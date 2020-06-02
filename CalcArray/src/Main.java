import java.util.Scanner;

public class Main {

	private static float num1;
	private static float num2;
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		MyArrays results = new MyArrays();
		
		System.out.println("This program will add 4 operations results to an array and then show all the elements in the array");
		System.out.println("Sum of two numbers");
		inputVars();
		results.addSum(num1, num2);
		
		System.out.println("Subtraction of number 1 by number 2");
		inputVars();
		results.addSub(num1, num2);
		
		System.out.println("Multiplication of two numbers");
		inputVars();
		results.addMult(num1, num2);
		
		System.out.println("Division of number 1 by number 2");
		inputVars();
		checkDiv();
		results.addDiv(num1, num2);
		
		showElements(results);
	}
	
	//input values into the variables every time it's called
	private static void inputVars() {
		System.out.println("Type number 1: ");
		num1=scan.nextFloat();
		System.out.println("Type number 2: ");
		num2=scan.nextFloat();
	}
	
	//recursive method to check if num2 value is 0 before proceeding
	public static void checkDiv() {
		if(num2==0) {
			System.out.println("Cannot divide by zero");
			inputVars();
			checkDiv();//The method will repeat itself till num2 has a valid input 
		}
	}
	
	public static void showElements(MyArrays results) {
		for(int i=0; i<results.getSize();i++) {
			System.out.println("Result "+ (i+1) + " = " + results.getResult(i));
		}
	}
	
}
