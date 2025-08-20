package singleInheritance;

public class SingleInheritanceChild extends SingleInheritanceParent {

	public void displayInfo()
	{
		System.out.println("Hello!!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleInheritanceChild obj = new SingleInheritanceChild();
		obj.display();
		obj.displayInfo();

	}

}
