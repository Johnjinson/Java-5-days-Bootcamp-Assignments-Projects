public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int num1, num2, temp;
		
		num1 = 45;
		num2 = 22;
		
		System.out.println("\nValues before swap :");
		System.out.println("num1 = " + num1 + "\tnum2 = " + num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("\nValues after swap :");
		System.out.println("num1 = " + num1 + "\tnum2 = " + num2);
	
	}
}
