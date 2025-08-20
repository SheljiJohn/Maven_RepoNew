package SuperKeywordExampleSecondUsage;

public class SuperKeywordChild1SecondUsage extends SuperKeywordParentSecondUsage{

	public void display()
	{
		System.out.println("Inside Child Class");
		System.out.println("WELCOME BACK");
	}
	public void displayInfo()
	{
		display();
		super.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeywordChild1SecondUsage obj = new SuperKeywordChild1SecondUsage();
		obj.displayInfo();

	}

}
