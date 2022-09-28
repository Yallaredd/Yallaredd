
//Create of abstrcat class
abstract class Civil
{
	// abstrcat method 
	public abstract int Multiplytwo(int n1, int n2);	// withot body
	//public abstract int Cube(int n1, int n2, int n3);
	
	// Regular method
	public void show()
	{
		//Body 
		
		System.out.println("Refular methods)");
	}
}
 class Branch extends Civil
{
	public int Multiplytwo(int n1, int n2)
 {
	return n1*n2;
 }

}
public class Absmethodspro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Civil obj=new Branch();
		System.out.println("Multiplication of two numbers"+obj.Multiplytwo(10, 20));
	}

}
