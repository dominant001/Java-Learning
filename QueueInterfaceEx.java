package demo;

import java.util.Deque;
import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;

class QueueInterfaceEx {
    
    public static Deque<Object> mergeQueue(Deque<Integer> intQueue, Deque<Character> charQueue) {
		//Implement your logic here and change the return statement accordingly 
		Deque<Object> iq = new ArrayDeque<Object>();
		for(int i = 0 ,j=0 ; i<intQueue.size() || j<charQueue.size();){
		   if(i<intQueue.size()) {
			   iq.add(intQueue.pop());
		   }
		   if(j<charQueue.size()) {
			   iq.add(charQueue.pop());
			   
		   }
		}
		
		return iq;
	}
	public static void main(String[] args) {
		
		Deque<Integer> integerQueue = new ArrayDeque<Integer>();
		integerQueue.add(3);
		integerQueue.add(6);
		integerQueue.add(9);
		
		Deque<Character> characterQueue = new ArrayDeque<Character>();
        characterQueue.add('a');
		characterQueue.add('e');
		characterQueue.add('i');
		characterQueue.add('o');
		characterQueue.add('u');
		characterQueue.add('b');
		
		Deque<Object> mergedQueue = mergeQueue(integerQueue, characterQueue);
		
		System.out.println("The elements in the merged queue are:");
		for(Object element: mergedQueue)
		    System.out.println(element);
	    
	}
}
