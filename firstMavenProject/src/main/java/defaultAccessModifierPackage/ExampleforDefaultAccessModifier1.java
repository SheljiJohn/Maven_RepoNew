package defaultAccessModifierPackage;

public class ExampleforDefaultAccessModifier1 {
	
	void showDisplay()
	{
		System.out.println("Default method is accessible...Inside Same Package and same Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleforDefaultAccessModifier1 obj = new ExampleforDefaultAccessModifier1();
		obj.showDisplay();
	}

}
