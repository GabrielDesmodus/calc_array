
public class Calculator {
	
	public static float sum(float num1, float num2) {
		return num1 + num2;
	}
	
	public static float subtract(float num1, float num2) {
		return num1 - num2;
	}
	
	public static float divide(float num1, float num2) {
		if(num2==0){
			System.out.println("Can't divide by zero");
			return divide(num1,num2);//Create a loop until the user input a valid number and then return the result
		}else {
			return num1 / num2;
		}
		
	}
	
	public static float multiply(float num1, float num2) {
		return num1 * num2;
	}
}
