package aggregationExample;

public class Student {
	
	int student_id;
	String student_name;
	
	Student(int student_id, String student_name)
	{
		this.student_id = student_id;
		this.student_name = student_name;
		
		
	}
	
	public void displayInfo()
	{
		System.out.println("The Student Details Are:");
		System.out.println("Student ID: " + student_id);
		System.out.println("Student Name: " + student_name);
	}

}
