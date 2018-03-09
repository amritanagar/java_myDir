package org.practice;
//import java.lang.*;
import java.util.*;

public class JavaProblemSolver1 {

	int[] inputArray = new int[] { 55, 35, 332, 26, 161, 4000 };

//Method #1
	public int getMinNumber() {
		int min = inputArray[0];
		int size = inputArray.length;
		for (int i = 1; i < size; i++) {
			if (min > inputArray[i]) {
				min = inputArray[i];
			}
		}
		return min;
	}

//Method #2
	public int getMaxNumber() {
		int max = inputArray[0];
		for (int i : inputArray) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}

//Method #3
	public int[] sortAscendingOrder() {
		int size = inputArray.length;
		int minIndex = 0;
		int innerCounter = 0;
		int min = 0;
		for (int outerCounter = 0; outerCounter < size; outerCounter++) {
			min = inputArray[outerCounter];
			minIndex = outerCounter;
			for (innerCounter = outerCounter; innerCounter < size; innerCounter++) {
				if (min > inputArray[innerCounter]) {
					min = inputArray[innerCounter];
					minIndex = innerCounter;
				}
			}
			System.out.println("min number = " + min + " index = " + minIndex);
			int c = inputArray[outerCounter];
			inputArray[outerCounter] = min;
			inputArray[minIndex] = c;
		}
		return inputArray;

	}

//Method #4
	public void pritFabonacciSeries(int n) {

		int element1 = 0;
		int element2 = 1;
		if (n <= 1) {
			if (n == 0) {
				System.out.println("Don't you wanna print any number???");
			} else {
				System.out.print(element1);
			}
		} else {
			System.out.print(element1 + ", " + element2);
			for (int count = 1; count <= n - 2; count++) {
				int x = element1 + element2;
				element1 = element2;
				element2 = x;
				System.out.print(", " + x);
			}
		}
	}


	//Method #5
	public boolean isPrime(int number) {
		boolean ans = true;
		if (number == 2) {
			return ans;
		}else{
			for (int iterator=2; iterator < number; iterator++) {
				if (number % iterator == 0) {
					ans = false;
					return ans;
				}
			}
		}
		return ans;
	}
	
	
	/*public char[] sortChar(char[] charArray) {
		
		return charArray;
	}*/
	
	
	public static void main(String[] args) {

	//Method Testing
		JavaProblemSolver1 obj = new JavaProblemSolver1();
		System.out.println("Min number is = " + obj.getMinNumber());
		System.out.println("Max number is = " + obj.getMaxNumber());
		/*
		 * int[] just = obj.sortAscendingOrder(); for (int n : just) {
		 * System.out.println(n); }
		 */
		obj.pritFabonacciSeries(15);
		System.out.println(obj.isPrime(17));
		
	//Array Testing
		/*int[] array1 = new int[] {1, 6};*/
		//System.out.println(array1); won't work!
		
	//ArrayList Testing
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("A");
		al1.add("C");
		al1.add("B");
		al1.add("B");
		al1.add("T");
		al1.add("O");
		
		
		System.out.println(al1);
		/*int x = Collections.binarySearch(al1, "O");
		System.out.println(x);*/
		System.out.println(Collections.binarySearch(al1, "C"));
		Collections.sort(al1);
		System.out.println(al1);
		System.out.println(Collections.binarySearch(al1, "C"));		
		
		
		/*ArrayList<String> al2 = new ArrayList<String>();
		al2.add("A");
		al2.add("B");*/
		//al.add(2); int can't be added
		
	//Linked List Testing
		/*LinkedList LkList = new LinkedList();
		LkList.add("Amrita");*/
		
		
		
		

	}

}
