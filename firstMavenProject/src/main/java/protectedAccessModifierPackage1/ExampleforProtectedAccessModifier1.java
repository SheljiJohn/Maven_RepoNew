package protectedAccessModifierPackage1;

public class ExampleforProtectedAccessModifier1 {
 
	protected void showDisplay()
	{
		System.out.println("Protected method is accessible...Inside Same Package and same Class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExampleforProtectedAccessModifier1 obj = new ExampleforProtectedAccessModifier1();
		obj.showDisplay();

	}

}
