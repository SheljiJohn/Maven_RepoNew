package encapsulation;

public class EncapsulationParent {
	
	private String student_name;
	private int roll_no;
	
	void setDetails(String student_name, int roll_no)
	{
		this.student_name = student_name;
		this.roll_no = roll_no;
	}
	
	void getDetails()
	{
		System.out.println("******Student Details*******");
		System.out.println("Student Name: " + student_name);
		System.out.println("Roll No: " + roll_no);
	}

}
