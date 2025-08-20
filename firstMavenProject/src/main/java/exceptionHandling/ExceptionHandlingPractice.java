package exceptionHandling;

public class ExceptionHandlingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b= 10;
		int result = 0;
		// result = b/a;
		// System.out.println(result);
		 
		 try
		 {
			 result = b/a;
			 System.out.println(result);
			 
		 }
		/* catch(ArithmeticException e)
		 {
		 System.out.println(e);
		 } */
		 finally
		 {
			 System.out.println("Executed successfully!!"); // will execute finally block even if the exception is handled or not handled. Commented catch block to check if the finally block is executed if the exception is not handled.
		 }

	}

}
