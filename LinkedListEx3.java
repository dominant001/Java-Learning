package demo;

import java.util.LinkedList;
import java.util.List;

class LinkedListEx3 {
    
    public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
	    //Implement your logic here and change the return statement accordingly
    	
    	List<Integer> updated = new LinkedList<Integer>();
    	for(int i = 0 ;i < listOne.size() ; i++) {
    		for(int j = 0 ; j<listTwo.size() ; j++) {
    			if(listOne.get(i).equals(listTwo.get(j))) {
    				updated.add(listTwo.get(i));
    			}
    		}
    	}
    	return updated;
	}
	
	public static void main(String arga[]){

		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(101);
		listOne.add(211);
		listOne.add(10);
		listOne.add(35);
		listOne.add(28);
		
		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(101);
		listTwo.add(211);
		listTwo.add(10);
		listTwo.add(35);
		listTwo.add(28);

		System.out.println(findCommonElements(listOne, listTwo));
	}
}
