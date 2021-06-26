package lexExercisesNotUsable;
class Pub{
	private int [] a = new int[4];

	public int[] getA() {
		return a;
	}

	public void setA(int x, int y) {
		this.a[0] = y;
	}
	
	
}

class Tester4 {

    public static void main(String[] args) {
       
       // System.out.println("Result: "+undergraduateStudent.getStudentName());
       Pub pub = new Pub();
       System.out.println("Result: "+pub.getA());
       pub.setA(0, 12);
        System.out.println("Result: "+pub.getA());
            
       
        
        //Create more objects of the classes for testing your code
    }
}
