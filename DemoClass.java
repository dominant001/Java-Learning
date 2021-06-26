package Demo;

public class DemoClass {
	
	static int sample() {
		return(true?null:0);
	}
	public static void main(String args[]) {
		String str1 = "https://www.infosys.com";
		String regex = "(http|https)(://)(www.)(\\w+)[.](com|net|org)";
		System.out.print(str1.matches(regex));
		
		
		int n1=1 , n2=-1;
		switch(n1) {
		case 0,1:
			n2 =1;
		case 2:
			n2 =2;
		default:
			n2 = 0;
		}
		System.out.println(n2);
		System.out.println();
			
			int pointer=0;
			int val =1;
		while( true ) 
		{
		++pointer;	
		if(pointer%2==0)
		continue;
		else if(pointer%5==0)
		break;
		val*=3;
		System.out.println(val);
		
		}
		float a = (float) (5.0/18);
		System.out.println(a*300);
		
		
		Calculate c = new Calculate();
		c.getSum(1632);
		
		
		int ax [] = {1,2};
		System.out.println("Hello");
		System.out.println("User");
		System.out.println(ax[1]);
		
		int m = (3>4)?((3>2)?3:2):((4>2)?4:2);
		System.out.println(m);
		
		System.out.println(DemoClass.sample());
		
		
	}
			

}

class Calculate{
	
	public void getSum(int n) 
    { 
        n = reverse(n); 
        int sumOdd = 0, sumEven = 0, c = 1; 
 
        while (n != 0) { 
 
            // If c is even number then it means 
            // digit extracted is at even place 
            if (c % 2 == 0) 
                sumEven += (n % 10)*(n%10); 
            n /= 10; 
            c++; 
        } 
       if(sumEven%9==0) {
    	   System.out.println("This is a magic no");
       }else {
    	   System.out.println("this is not a magic no");
       }
    }
        
        
	static int reverse(int n) 
	{ 
	    int rev = 0; 
	    while (n != 0) { 
	        rev = (rev * 10) + (n % 10); 
	        n /= 10; 
	    } 
	    return rev; 
	} 
}
