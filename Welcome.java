package demo;

public class Welcome {
	public static void main(String[] args) {
		int age = 10;
		System.out.println("Hello");
		System.out.println(age);
		
		//data types
		/* boolean 1 bit
		 * char 2 byte
		 * byte 1byte
		 * short 2 byte
		 * int 4 byte
		 * long 8 byte
		 * float 4 byte 
		 * double 8 byte 
		 */
		
		//operators
		/* c++, c--
		 * ++c, --c
		 * relational operators ==, <,>,<=,>=,!= result is boolean value
		 * ~ flip operator on binary
		 * ! opposite in boolean
		 * Urinary operator
		 * airthemetic operator +,-,*,/,%
		 * logical operators &&, ||, !
		 * ternary operator  (condition ? if condition is true : if condition is false)
		 * assignment opeartors +=, -=, *=, %=, /= (a = a+b => a+=b)
		 * bit wise operator <<, >>, |, & (a<<1)(a|b), >>> , <<< unsigned operator
		 */
		
		System.out.print(Float.SIZE);
		float fvar = 3.14f;
		long lvar = 101;
		fvar = lvar; // bigger to smaller but as a implicit because it take the value in decimal value place
		
		double d1 = lvar;
		lvar = (long)d1; // explicit
		
		d1 = fvar; // implicit
		
		
		
		// Control Sequence
		
		/*if condition
		 * if and else
		 * if elseif else 
		 * Nested if else
		 * Switch Case
		 */
		
		//iteration control structure
		/* while loop (entery controlled loop)
		 * do while loop (exit controlled loop)
		 * for
		 * 
		 * 
		 * */
		
		int i,a= 5;
		 i = a;
		while(a>0){
		   
			a--;
		    i = i * a;
		    
		    System.out.println(i);
		}
		
		
		
	}
}
