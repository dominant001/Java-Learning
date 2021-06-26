package Demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Examples {
	
	ArrayList<String> lista = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		Examples ex = new Examples();
		ex.data();
		//ex.show("building1", "trainee","Employee",1,2,3);
		
		
	}
	
	
//	public static void show (String building, String ...roles, int ...numbers) {
//		System.out.println(building+ " " + roles+ " " + numbers.length);
//	}
	public void data() {
		
//		List<String> list = new LinkedList<String>();
//		list.add("hvj");
//		list.add("abjs");
//		list.add(0,"rag");
//		System.out.println(list);
		
		
		Integer n = 127;
		//Integer n2 = 127;
		Integer n1 = new Integer("127");
		System.out.println(n1==n);
		System.out.println(n.equals(n1));
		
		
		
//		
//		try {
//			throw new Exception("Exception");
//		}catch(Exception e) {
//			System.out.println("hello" + e.getMessage());
//		}
		
		
		
		
//		int arr[] = {0,1,2,3,4};
//		try {
//		try {
//			int a = 10;
//			int b = a/0;
//		}catch(ArithmeticException e) {
//			System.out.println("hello");
//		}
//		try {
//			int c = arr[5]*arr[0];
//		}catch(ArithmeticException e) {
//			System.out.println("hello1");
//		}finally {
//			System.out.println("final");
//		}
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("hello3");
//		}
		
//		int arr[][] = {{2,7,9},{3,6,1},{7,4,2}};
//		for(int i = 0; i<3;i++) {
//			for(int j=0;j<3;j++) {
//				if(i<6) 
//					break;
//				System.out.println(arr[i][j] + arr[0][0]);
//			}
//		}
		
		
		
		
		LocalDate l = LocalDate.of(2018, 4, 18);
		LocalDate l1 = LocalDate.of(2017, 3, 15);
		System.out.println(l.until(l1, ChronoUnit.DAYS));
		
		 l = l.minusDays(18);
		 l.minusMonths(1);
		 System.out.println(l);
		 
		
		
		
		
//		String name1 = "Alpha", name2 = "Beta", name3 = "Theta" ;
//		name1.toLowerCase();
//		name3.replace("Theta", "alpha");
//		System.out.println(name1.equals(name3));
//		String name4  = name2.concat(" ").repeat(2);
//		System.out.println(name4.strip().length());
		
		
		
//		String a = " Ankit   ";
//		String b =  a.strip();
//		System.out.println(b.contains("n"));
//		System.out.println(b);
		
		
		//creation of StringBuilder Object with capacity 50.
//		StringBuilder name = new StringBuilder(50);
//						
//		name.append("Mississippi");
//		int length = name.length();  // will give the length of address
//		name.insert(length, " River");
//		System.out.println(name);   //Output :- Mississippi River
//				
//		name.reverse();    // Output :- reviR ippississiM
//		name.delete(5, 10); // Output :- reviRssissiM
//		System.out.println(name);  // Output :- i
		
		
		
//		StringBuilder s1 = new StringBuilder("Java");
//		String s2 = new String(s1);
//		
//		String s11 = "Willow";
//		System.out.println(s11 == "Willow");
		
		
		
//		
//		int[] numArr = {6,8,9,10,40,66};
//		int resultIndex = Arrays.binarySearch(numArr, 40);
//		System.out.println(resultIndex);
//		
//		int[] numArr1 = {6,8,9,10,40,66};
//		int[] numArr2 = {6,8,9,10,40,66};
//		boolean resultCompare = Arrays.equals(numArr1, numArr2);
//		System.out.println(resultCompare); //prints true or false
//		
//		int[] numArr3 = {18,8,9,10,40,66};
//		Arrays.sort(numArr3);
//		for(int a : numArr3) {
//			System.out.println(a);
//		}
//		
//		System.out.println(Arrays.toString(numArr3));
		
		
		
//		String[] pizzaSize = {"Regular", "Medium", "Large"};
//		int[] pizzaCost = {100, 250, 390};
//		String[] pizzaOrdered = {"Medium", "Regular"};
//		int[] quantityOrdered = {2, 1};
//		float totalAmount = 0f;
//		for(int index1 = 0; index1 < pizzaOrdered.length ; index1++) {
//		    for(int index2 = 0; index2 < pizzaSize.length ; index2++) {
//		        if ( pizzaOrdered[index1] == pizzaSize[index2] ) {
//		            totalAmount += pizzaCost[index2] * quantityOrdered[index1];
//		        }
//		        else {
//		            totalAmount += 0;
//		        }
//		    }
//		}
//		totalAmount = totalAmount - (totalAmount*(float)5/100);
//		System.out.println("Your total bill amount is: "+totalAmount);

		
		
		//int s [][] = new int[2][];s[0] = new int[2];
		
		
		
//		WebAddressValidator w = new WebAddressValidator();
//        boolean res = w.isValidWebAddress("http://www.infosys2.net");
//        if(res ==true){
//            System.out.println("Valid");
//        }
//        else{
//            System.out.println("InValid");
//        }

		
		//date time
		
//		LocalDate today = LocalDate.now(); // now() returns the current date from system clock
//		System.out.println(today); //
//		LocalDate dateObj = LocalDate.of(1997, 8, 29);
//		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy"); //ofPattern() creates a formatter using the specified pattern.	
//		System.out.println(df.format(dateObj)); //output 29/08/97
//
//		LocalDate newDate = today.plusDays(34); 
//		System.out.println(newDate); 
//		
//		
//		System.out.println(ChronoUnit.DAYS.between(today, newDate));
		
		
				

	}

}



//class WebAddressValidator{
//
//	
//    public boolean isValidWebAddress(String webAddress){
//        //code here
//        String regex = "(http|https)(://www.)[\\w]+.(com|org|net)";
//        if(webAddress.matches(regex)){
//            return true;
//        }
//        else {
//        	return false;
//        }
//        
//    }
//    
//}

