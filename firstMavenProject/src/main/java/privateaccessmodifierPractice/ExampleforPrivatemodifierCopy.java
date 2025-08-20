package privateaccessmodifierPractice;

public class ExampleforPrivatemodifierCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleforPrivatemodifier obj1 = new ExampleforPrivatemodifier();
		//obj1.displayinfo(); Error: not accessible due to access modifier as "Private". cannot be accessed from  outside the class.
		obj1.welcomeMessage();

	}

}
