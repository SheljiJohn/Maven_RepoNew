package aggregation;

public class Author {
	
	String name;
	String place;
	int pincode;
	
	Author(String name, String place, int pincode)
	{
		this.name = name;
		this.place = place;
		this.pincode = pincode;
	}
	
	public void displayInfo()
	{
		System.out.println("Author Details:");
		System.out.println(name);
		System.out.println(place);
		System.out.println(pincode);
	}

}
