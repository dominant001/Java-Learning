package demo;

// Method Overriding Exercise 1
abstract class Student{
    //Implement your code here
	
	private String studentName;
	private int[] testScores  ;
	private String testResult;
	
	
	public Student(String studentName) {
		this.studentName = studentName;
		this.testScores = new int[4];
		}
	
	public abstract void generateResult();

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int[] getTestScore() {
		return testScores;
	}

	public void setTestScore(int testNumber, int testScore) {
		this.testScores[testNumber] = testScore;
	}

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
}

class UndergraduateStudent extends Student{
    //Implment your code here
	
	public UndergraduateStudent(String studentName) {
		super(studentName);
		
	}
	
	public void generateResult(){
		int calculate = 0 ;
		for(int t :  this.getTestScore() ) 
		{
		calculate = calculate + t;
		}
		calculate = calculate/this.getTestScore().length;
		if(calculate>=60) {
			this.setTestResult("Pass");
		}
		else if (calculate < 60) {
			this.setTestResult("Fail");
		}
		
	}

}

class GraduateStudent extends Student{
    //Implment your code here
	
	public GraduateStudent(String studentName) {
		super(studentName);
	}
	
	public void generateResult(){
		int calculate = 0 ;
		for(int t :  this.getTestScore() ) 
		{
		calculate = calculate + t;
		}
		calculate = calculate/this.getTestScore().length;
		if(calculate>=70) {
			this.setTestResult("Pass");
		}
		else if (calculate < 70) {
			this.setTestResult("Fail");
		}
		
	}
	
}

class Tester2 {

    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
            
        //	System.out.println("Result: "+undergraduateStudent.getTestScore()[0] + " " + undergraduateStudent.getTestScore()[1]+ " "+ undergraduateStudent.getTestScore()[2]+ " "+ undergraduateStudent.getTestScore()[3]);
        undergraduateStudent.generateResult();
            
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());
        
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
            
        graduateStudent.generateResult();
            
        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
        
        //Create more objects of the classes for testing your code
    }
}
