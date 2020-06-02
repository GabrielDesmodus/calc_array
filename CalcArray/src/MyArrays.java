import java.util.ArrayList;

public class MyArrays {
	
	//This class manages the arrays creation and management
	
	private ArrayList<Float> results;
		
	public MyArrays() {
		this.results = new ArrayList<Float>();
	}
	
	//Adding elements to the end of the array
	public void addSum(float num1, float num2) {
		
		this.results.add(num1 + num2);
	}
	
	public void addSub(float num1, float num2) {
		
		this.results.add(num1 - num2);
	}
	
	public void addDiv(float num1, float num2) {
		
		this.results.add(num1 / num2);
	}
	
	public void addMult(float num1, float num2) {	
		
		this.results.add(num1 * num2);
	} 

	public float getResult(int pos) {
		return results.get(pos);
	}

	public int getSize() {
		return results.size();
	}
	
	
}

