package assignment1;

public class Exercise10_03 {
	public static void main(String[] args) {
		MyInteger n1 = new MyInteger(5);
		System.out.println("n1 is even?" + n1.isEven());
		System.out.println("n1 is prime?" + n1.isPrime());
		System.out.println("n1 is odd?" + n1.isOdd());		
		
	}//main

}//exercise

class MyInteger {
	
	//Write code below
	int value; //the data field that is in the requirements.
	boolean even = false;
	boolean prime = false;
	boolean odd = false;

	public MyInteger(int x) {
		this.value = value;
		
		if (value % 2 == 0) {
			even = true;
		}
		else {
			odd = true;
		}
		
		for (int i = 0; i > ((value / 2) + 1); i++) {
			if (value % i == 0) {
				prime = true;
			}
		}
		
	}
	
	public int getX() {
		return value;
	}
	
	public boolean isEven(int x) {
		
		if (value % 2 == 0) {
			even = true;
		}
		
		return even;
	}
	
	
	
	
	
	
}