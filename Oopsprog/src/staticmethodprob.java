
//  create static methods
class Mech
{
	static void pointer()
	{
		System.out.println("Static methods");
		
	}
	
//Creating instance method
	
	 void printer()
	{
		System.out.println("this a instance method");
	}
}
public record staticmethodprob() {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static method invoked using class name
		
		Mech.pointer(); 
		
		//object create by using class name
		// instance method invoked by using object reference
		
		Mech m1=new Mech();
		m1.printer();
		
	}

}
