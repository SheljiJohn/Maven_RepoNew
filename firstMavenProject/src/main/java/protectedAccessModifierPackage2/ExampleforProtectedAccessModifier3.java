package protectedAccessModifierPackage2;

import protectedAccessModifierPackage1.ExampleforProtectedAccessModifier1;

public class ExampleforProtectedAccessModifier3 extends ExampleforProtectedAccessModifier1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleforProtectedAccessModifier1 obj = new ExampleforProtectedAccessModifier1();
		//obj.showDisplay();
		System.out.println("Inheritance applied....Inside Same Package");
		ExampleforProtectedAccessModifier3 obj1 = new ExampleforProtectedAccessModifier3();
		obj1.showDisplay();
	}

}
