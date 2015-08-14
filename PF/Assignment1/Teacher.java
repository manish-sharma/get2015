public class Teacher extends Person
{
	
	int empId;
	String []specialization;
	
	public Teacher(int uid, String name, int empId)
	{
		super(uid , name);
		this.empId = empId;
	}
	
	int getEmpId()
	{ 
		return empId;
	}
	public void setEmpId(int empId)
	{ 
		this.empId = empId;
	}
	public String[] getSpecialization()
	{ 
		return specialization;
	}
	public void setSpecialization(String[] specialization) 
	{ 
		this.specialization = specialization;
	}
	public String toString()
	{
		return super.toString()+ ", StudentId "+empId;
	}
}
