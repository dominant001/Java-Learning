package lexExercisesNotUsable;

public class typeConversionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//widening or automatic conversion
		int varone = 10;
		float vartwo = varone;
		System.out.println(varone);
		System.out.println(vartwo);
		
		// Narrowing or Explicit conversion
		
		float v1 = 12.5f;
		int v2 = (int)v1;
		System.out.println(v1);
		System.out.println(v2);
		
		short no = 32767;
		short no1 = (short)(no+1);
		System.out.println(no1);

	}

}
