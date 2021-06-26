package lexExercisesNotUsable;

public class StringEx {
	
	
	 public static String removeWhiteSpaces(String str){
			//Implement your code here and change the return value accordingly
		 
		 //str.concat(str);
		 str = str.replaceAll("\\s", "");
	        return str;
		}
		
		public static void main(String args[]){
			String str = "[Having a woderful day]";
			str = removeWhiteSpaces(str);
			System.out.println(str);
		}

}
