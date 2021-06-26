package demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class LinkedListEx2 {

	public static List<Integer> removeDuplicates(List<Integer> list) {
        //Implement your logic here and change the return statement accordingly
		
		List<Integer> updatedList = list;
	
		for(int i = 0;i<list.size()-1;i++) {
			for(int j = i+1; j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) {
					updatedList.remove(j);
				}
			}
		}
        
        return updatedList;
	}
	
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(21);
		list.add(15);
		list.add(10);
		
		List<Integer> updatedList = removeDuplicates(list);
		
		System.out.println("Linked list without duplicates");
		for (Integer value : updatedList) {
			System.out.print(value+" ");
		}
	}
	
}
