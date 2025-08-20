package SuperKeywordExample;

public class SuperKeywordChild1 extends SuperKeywordParent {
	int a= 2;
	
	public void display()
	{
		System.out.println(a);
		System.out.println(super.a); // parent class variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeywordChild1 obj = new SuperKeywordChild1();
		obj.display();

	}

}
