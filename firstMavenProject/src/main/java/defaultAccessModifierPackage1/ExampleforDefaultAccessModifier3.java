package defaultAccessModifierPackage1;

import defaultAccessModifierPackage.ExampleforDefaultAccessModifier1;

public class ExampleforDefaultAccessModifier3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleforDefaultAccessModifier1 obj2 = new ExampleforDefaultAccessModifier1();
		//obj2.showDisplay(); ERROR: The method showDisplay()(access modifier is Default and it's visible within the package) from the type ExampleforDefaultAccessModifier1 is not visible
	}

}
