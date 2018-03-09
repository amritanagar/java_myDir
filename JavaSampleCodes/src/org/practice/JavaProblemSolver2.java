package org.practice;

public class JavaProblemSolver2 {

	// Write Java Code To Swap Two Numbers Without Using A Temporary Variable?
	public void swapingNumbers(int a, int b) {
		System.out.println("Given number a = " + a);
		System.out.println("Given number b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Output:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	// Write Java code to get rid of multiple spaces from a string?
	public String removeSpaces(String inputString) {
		
		return inputString.replaceAll("\\s", "");
		
		/*String[] str = inputString.split("\\s"); 
		String outputString = "";
			
		for(String newStr : str) {
			outputString = outputString + newStr;
		}
		
		return outputString;*/
	}

	//Write a function to reverse a number in Java?
	public int reverseNumber(int number) {
		String str = Integer.toString(number);
		String outputString = "";
		
		char[] charArray = str.toCharArray();
		
		for (int i = (charArray.length - 1)  ; i >= 0; i--) {
			outputString = outputString + Character.toString(charArray[i]);
		}
		
		return Integer.parseInt(outputString);
	}
	
	//Write a Java program to demonstrate string reverse with and without StringBuffer class?
	public String reverseStringUsingStrBuffer(String inputString) {
		
		//String outputString = "";
		StringBuffer buffer = new StringBuffer(inputString);
		buffer = buffer.reverse();
		//System.out.println(buffer);
		return buffer.toString();		
		
	}
	
	// Write Java code to identify a number as Palindrome?
	public boolean isPalindrome(int number) {
		String str = Integer.toString(number);
		char[] charArray = str.toCharArray();
		int halfLength = charArray.length/2;
		
		for(int i = 0; i <= halfLength; i++) {
			if(charArray[i] != charArray[charArray.length-1-i]) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		JavaProblemSolver2 obj = new JavaProblemSolver2();
		// obj.swapingNumbers(52, 100);
		// System.out.println(obj.removeSpaces("This is an apple."));
		//System.out.println(obj.reverseNumber(56982));
		//System.out.println(obj.reverseStringUsingStrBuffer("Arvind"));
		System.out.println(obj.isPalindrome(1234554321));
	}

}
