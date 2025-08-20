package polymorphismExample;

public class CompileTimePolymorphism {
	
	public int addition (int a, int b)
	{
		int c = a+b;
		return c;
	}
	public float addition ( float d, float f)
	{
		float g = d + f;
		return g;
	}
	public float addition (int h, int i, float j)
	{
		float k = h+ i+ j;
		return k;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompileTimePolymorphism obj = new CompileTimePolymorphism();
		System.out.println(obj.addition(10, 20));
		System.out.println(obj.addition(2.5f, 2.5f));
		System.out.println(obj.addition(1, 8, 1.0f));

	}

}
