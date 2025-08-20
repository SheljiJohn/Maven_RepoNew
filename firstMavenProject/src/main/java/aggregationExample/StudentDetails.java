package aggregationExample;

public class StudentDetails {
	
	String place;
	String country;
	
	Student obj;
	
	StudentDetails(String place, String country, Student obj )
	{
		this.place = place;
		this.country = country;
		this.obj = obj;
	}
	
	public void display()
	{
		System.out.println("###########Address##########");
		System.out.println("Place: " + place);
		System.out.println("Country: " + country);
		System.out.println();
		obj.displayInfo();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student(100, "Shelji");
		StudentDetails details = new StudentDetails("Aluva", "INDIA", s);
		details.display();

	}

}
