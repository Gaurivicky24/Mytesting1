package Single_level_inheritance;

public class Single_level {

	public static void main(String[] args) 
	
	{ 
		//call daughter class and mother class
		//create object first
		//Daughter extends Mother 
		
		
		Mother_superclass o=new Mother_superclass();
		o.nature();
		o.money();
		o.flat();
		
		System.out.println("=====================");
		
		//create daughter object
		
		Daughter_subclass v=new Daughter_subclass();
		v.flat(); //Calling mothers class method in daughter class with the help of extends keyword
		v.money();
		v.nature();
		
		System.out.println("====================");
		
		v.mobile();
		v.laptop();
		

	}

	
}
