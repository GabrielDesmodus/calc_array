import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static float num1;
	private static float num2;
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num1, num2;
		
		ArrayList<Float> results = new ArrayList<Float>();
		
		System.out.println("Sum of two numbers");
		inputVars();
		results.add(Calculator.sum(num1,num2));
		
		System.out.println("Division of number 1 by number 2");
		results.add(Calculator.divide(num1,num2));
		results.add(Calculator.multiply(num1,num2));
		results.add(Calculator.subtract(num1,num2));
		results.add(Calculator.sum(num1,num2));

	}
	
	public static void inputVars() {
		System.out.println("Type number 1: ");
		num1=scan.nextFloat();
		System.out.println("Type number 2: ");
		num2=scan.nextFloat();
	}

}
