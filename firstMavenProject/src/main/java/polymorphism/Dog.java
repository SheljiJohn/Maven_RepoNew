package polymorphism;

public class Dog extends Animal{
	void sound()
	{
		System.out.println("Dog Barks..");
		super.sound();	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.sound();

	}

}
