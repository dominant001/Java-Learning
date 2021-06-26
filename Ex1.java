package demo;

public class Ex1 {
	
	public double findAverage(int number1, int number2, int number3) {
		double avg;
		avg = (number1+number2+number3)/3.0;
		avg = Math.round(avg*100.0)/100.0;
		return avg; 
	}
	
	public static void main(String[] agrs) {
		Ex1 e = new Ex1();
		System.out.println(e.findAverage(10, 20, 30));
		
		int a = 1%2;
		System.out.println(a);
	}

}
