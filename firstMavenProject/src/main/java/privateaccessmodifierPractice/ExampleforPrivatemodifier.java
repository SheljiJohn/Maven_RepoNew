package privateaccessmodifierPractice;

public class ExampleforPrivatemodifier {
	
	private void displayinfo()
	{
		System.out.println("Inside Same class");
		System.out.println("Your details are...");
	}
	public void welcomeMessage()
	{
		System.out.println("Inside Same class");
		System.out.println("WELCOME!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleforPrivatemodifier obj = new ExampleforPrivatemodifier();
		obj.displayinfo();
		obj.welcomeMessage();
	}

}
