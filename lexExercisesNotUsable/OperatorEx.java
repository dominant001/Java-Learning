package lexExercisesNotUsable;

public class OperatorEx {

	public static void main(String[] args) {
		
		
		//Bitwise operators
		int a = 10;
		int b = 20;
		
		System.out.println(a<<2); // 0000 1010 => 0010 1000
		System.out.println(b>>3); // 0001 0100 => 0000 0010

		//Unsigned operator value are same in +ve value
		System.out.println(a>>2); // 0000 1010 => 0000 0010
		System.out.println(a>>>2);// 0000 1010 => 0000 0010
		
		int c=-1;
		System.out.println(c>>2); //-1
		System.out.println(c>>>2); //1073741823
		
		System.out.println(a|b); //0000 1010, 0001 0100 =>0010 1010
		System.out.println(a&b); //=> 0000 0000
		
	
		

		
	}

}
