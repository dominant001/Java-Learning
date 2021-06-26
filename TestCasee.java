package demo;

import org.junit.*;

//import junit.framework.*;

public class TestCasee {

	Trainee tr = new Trainee();
	@Test
	public void findGradeTest() {
		
		int input = 76;
		String excepted1 = "Pass";
		String actualoutput = tr.findGrade(input);
		Assert.assertEquals(excepted1, actualoutput);
		
	}
	
	@Test
	public void findGradeTest1() {
		int input2 = 7;
		String excepted2 = "Fail";
		String actualoutput2 = tr.findGrade(input2);
		Assert.assertEquals(excepted2, actualoutput2);

}
}
