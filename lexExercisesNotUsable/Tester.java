package lexExercisesNotUsable;

class Employee {

	private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;

	public int calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		return this.salary += this.bonus;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}
}

class Tester {

	public static void main(String args[]) {

		Employee employee = new Employee();
//		employee.employeeId = "C101";
//		employee.employeeName = "Steve";
//		employee.salary = 650;
//		employee.jobLevel = 4;
		
		employee.setEmployeeId("C101");
		employee.setEmployeeName("Steve");
		employee.setSalary(650);
		employee.setJobLevel(4);
		//int level = employee.getJobLevel();
		int calculatedsalary;

		System.out.println("Employee Details");
		calculatedsalary=employee.calculateSalary();
		System.out.println(calculatedsalary);

		
//		System.out.println("Employee Id: " + employee.employeeId);
//		System.out.println("Employee Name: " + employee.employeeName);
//		System.out.println("Salary: " + employee.salary);

	}
}
