package heirarchicalInheritance;

public class HeirarchicalInheritanceChild2 extends HeirarchicalInheritanceParent {
	
	public void displayChild2()
	{
		System.out.println("INSIDE Child2 CLASS..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HeirarchicalInheritanceChild2 obj = new HeirarchicalInheritanceChild2();
			
			obj.displayParent();
			obj.displayChild2();
			
			HeirarchicalInheritanceChild1 obj1 = new HeirarchicalInheritanceChild1();
			obj1.displayParent();
			obj1.displayChild1();

	}

}
