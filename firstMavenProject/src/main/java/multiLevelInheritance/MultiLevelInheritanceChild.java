package multiLevelInheritance;

public class MultiLevelInheritanceChild extends MultiLevelInheritanceIntermediatory{

	public void animalChild()
	{
		System.out.println("I'm a cute PUPPY!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiLevelInheritanceChild obj = new MultiLevelInheritanceChild();
		obj.animalParent();
		obj.animalIntermediatory();
		obj.animalChild();

	}

}
