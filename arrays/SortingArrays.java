package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrays {
static int[] input;
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		printArray(sortInput(getInput(5)));
	}
	
	
public static int[] getInput(int length){
	input = new int[length];
	System.out.println("Please enter " +length + " int value:\r");
	for(int i = 0; i<length;i++){	
	input[i] = sc.nextInt();
	}
	return input;
}


public static int[] sortInput(int[] inputArray) {
	int[] sortedArray = Arrays.copyOf(inputArray, inputArray.length);
	int temp;
	boolean flag = true;
	while(flag){
		flag = false;
		for(int i =0; i< sortedArray.length-1;i++){
			if(sortedArray[i] < sortedArray[i+1]) {
				temp = sortedArray[i];
				sortedArray[i] = sortedArray[i+1];
				sortedArray[i+1] = temp;
				flag = true;
			}
		}
	}
	return sortedArray;
	
}


public static void printArray(int[] input){
	for(int i = 0; i<input.length;i++){
		System.out.print(input[i] + " ");
	}
}
}
