package lexExercisesNotUsable;

class Faculty{
    private String name;
    private float basicSalary;
    private float bonusPercentage;
    private float carAllowancePercentage;
    
    
    public Faculty(String name, float basicSalary) {
    	this.name = name;
    	this.basicSalary = basicSalary;
    	this.bonusPercentage = 4f;
    	this.carAllowancePercentage = 2.5f;
    }
    
    public double calculateSalary() {
    	double totalSalary;
    	totalSalary = basicSalary + (basicSalary*bonusPercentage)/100.0 + (basicSalary*carAllowancePercentage)/100.0;
    	return totalSalary;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}

	public float getCarAllowancePercentage() {
		return carAllowancePercentage;
	}

	public void setCarAllowancePercentage(float carAllowancePercentage) {
		this.carAllowancePercentage = carAllowancePercentage;
	}
    
}

class OfficeStaff extends Faculty{
    //Implement your code here
	private String designation;
	
	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name,basicSalary);
		this.designation = designation;
	}
	
	@Override
	public double calculateSalary() {
		double totalSalary;
		totalSalary = getBasicSalary() + (getBasicSalary()*getBonusPercentage())/100.0 + (getBasicSalary()*getCarAllowancePercentage())/100.0;
		if(designation.equals("Accountant")) {
		totalSalary = totalSalary + 10000.0;
		}
		else if(designation.equals("Clerk")) {
		totalSalary = totalSalary + 7000.0;
		}
		else if (designation.equals("Peon")) {
		totalSalary = totalSalary + 10000.0;
		}
    	return totalSalary;
    }

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}

class Teacher extends Faculty{
    private String qualification;
    
    public Teacher(String name, float basicSalary, String qualification) {
		super(name,basicSalary);
		this.qualification = qualification;
    }
    @Override
	public double calculateSalary() {
    	
    	double totalSalary;
		totalSalary = getBasicSalary() + (getBasicSalary()*getBonusPercentage())/100.0 + (getBasicSalary()*getCarAllowancePercentage())/100.0;

		if(qualification.equals("Doctoral")) {
		totalSalary = totalSalary + 20000.0;
		}
		else if(qualification.equals("Masters")) {
		totalSalary = totalSalary + 18000.0;
		}
		else if (qualification.equals("Bachelors")) {
		totalSalary = totalSalary + 15500.0;
		}
		else if (qualification.equals("Associate")) {
		totalSalary = totalSalary + 10000.0;
		}
    	return totalSalary;
    	
    }
    
   
    public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}


class MethodOverridingAssignmentEx {
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");
		
		System.out.println("Teacher Details\n***************");
		System.out.println("Name: "+teacher.getName());
		System.out.println("Qualification: "+teacher.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher.calculateSalary()*100)/100.0); 
		System.out.println();

		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: "+officeStaff.getName());
		System.out.println("Designation: "+officeStaff.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0); 

        //Create more objects for testing your code   

	}
}

