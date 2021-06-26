package lexExercisesNotUsable;

import demo.Trainee;

public class arrayEx {
	
	public static int calculateSumOfEvenNumbers(int[] numbers){
	    //Implement your code here and change the return value accordingly
		int count = 0;
	    for (int arr : numbers){
	        if (arr%2==0){
	            count+=arr;
	        } 
	    }
	    return count;
	}

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));
	}
	
}




