package demo;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.*;

class QueueInterfaceex2 {
    
    public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
		//Implement your logic here and change the return statement accordingly
			Deque<Integer> resultStack = new ArrayDeque<Integer>();
			Deque<Integer> minStack = new ArrayDeque<Integer>();
			int Min = Collections.min(inputStack);
			for(Integer i : inputStack) 
			{
				if(i == Min) {
					minStack.push(Min);
				}
				else {
					resultStack.push(i);
				}
			
			}
			for(Integer j : resultStack) 
			{
				minStack.push(j);
			}
			
			
		return minStack;
	}

	public static void main(String[] args) {
		
		Deque<Integer> inputStack = new ArrayDeque<Integer>();
		inputStack.push(10);
		inputStack.push(8);
		inputStack.push(5);
		inputStack.push(12);
		inputStack.push(5);
	
		Deque<Integer> updatedStack = changeSmallest(inputStack);
		
		System.out.println("Stack After Modification:");
		for (Integer value : updatedStack)
			System.out.println(value);
	}
}