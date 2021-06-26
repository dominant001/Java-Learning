package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionEx {

	public static void main(String[] args) {
		
		//normal list
//		List list1 = new ArrayList();
//		list1.add(15); // true if added elase give false
//		list1.add(23);
//		list1.add(0,56);
//		list1.add("Ram");
//		list1.add(20000.0);
//		
//		System.out.println(list1);
		
		
		
		//generic example
		List <Double>marks = new ArrayList<>();
		marks.add(20.0);
		marks.add(46.5);
		marks.add(70.8);
		
		
		//print mechanism
//		System.out.println(marks);
//		
//		System.out.println(marks.remove(1));
//		System.out.println(marks.remove(20.0));
//		System.out.println(marks.get(0));
//		System.out.println(marks.size());
//		System.out.println(marks);
//		
//		for(int i = 0 ; i<marks.size(); i++) {
//			System.out.println(marks.get(i));
//		}
//		
//		for(Double d : marks) {
//			System.out.println(d);
//		}
		
		//iterator
		//hasnext => returns boolean based on if next value is present or no
		//.next => moves to the next position and returns the value presenet there
				
//		Iterator<Double> i = marks.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		
		List <Integer>marks1= new ArrayList<>();
		marks1.add(20);
		marks1.add(4);
		marks1.add(7);
		marks1.add(1);
		marks1.add(2);
		marks1.add(3);
		marks1.add(5);
		
		
		System.out.println(marks1.remove(1));
		System.out.println(marks1);
		System.out.println(marks1.remove(Integer.valueOf(2)));
		System.out.println(marks1);
		
		//contains
		System.out.println(marks1.contains(5));
		
		
		
	
		
		//generic method Ex reference
//		Integer[] intArray = {1,2,3,4,5,6};
//		ArrayUtility.printArrayValue(intArray, "Integer Data Type");
//	
//		
//		String[] strArray = {"A", "1", "Ram"};
//		ArrayUtility.printArrayValue(strArray, "String Data Type");
		
		
		
		List<Trainee> traineeList = new ArrayList<>();
		traineeList.add(new Trainee(4));
		traineeList.add(new Trainee(124));
		traineeList.add(new Trainee(344));
		traineeList.add(new Trainee(254));
		traineeList.add(new Trainee(426));
		
		System.out.println(traineeList.contains(new Trainee(124)));
		Comparator<Trainee> traineeComp  = new TraineeComperator();
		traineeList.sort(traineeComp);// Comparator --> Functional Interface --> Compare()
		System.out.print(traineeList);
		
		//another way of sorting
		
		Collections.sort(traineeList); // Comparable
		
		
	}

}

class TraineeComperator  implements Comparator<Trainee>{

	@Override
	public int compare(Trainee trainee1, Trainee trainee2) { // trainee1 -> Major object, trainee2 -> Minor Object
		
		if(trainee1.id.equals(trainee2.id)) {
			return 0;
		}
		else if(trainee1.id > trainee2.id) {
			return 1;
		}
		else {
			return -1;
		}
		
		//return 0 -> t1 == t2
		//retourn +ve -> major > minor
		//return -ve -> major < minor
	}
	
}



class Trainee implements Comparable<Trainee>{
	Integer id;
	
	Trainee(Integer id){
		this.id = id;
	}
	
	@Override 
	public int hashCode() {
		final int prime = 31;
		int res = 1;
		res = prime*res + ((id == null) ? 0 : id.hashCode());
		return res;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		Trainee other = (Trainee)o;
		
		 if(o == null) {
			if(other.id != null) {
				return false;
			}
		}
		else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Trainee [id=" + id + "]";
	}

	@Override
	public int compareTo(Trainee trainee) {
		// TODO Auto-generated method stub
		return this.id.compareTo(trainee.id);
	}
	
	
}


//generic method
//class ArrayUtility{
//	public static <M,N> N printArrayValue(M[] Array, N datatype) {
//		System.out.println(Array[0].getClass());
//		for(M i : Array) {
//			System.out.println(i);
//		}
//		return datatype;
//	}
//}