package exceptionHandling;

public class MultipleExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a[] = {1,2,3,4};
			int b[] = new int[2];
			String str = null;
			System.out.println(str.length());
			b[2] = 3/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index not found" + e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception Encountered" + e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Executed");
		}

	}

}
