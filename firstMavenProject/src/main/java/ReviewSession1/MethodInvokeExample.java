package ReviewSession1;

public class MethodInvokeExample {
	
	public void method1()
	{
		System.out.println("Inside first method");
		System.out.println("Hello");
	}
	public void method2()
	{
		System.out.println("Inside second method...");
		System.out.println("Calling first method..");
		this.method1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodInvokeExample obj = new MethodInvokeExample();
		obj.method2();
	}

}
