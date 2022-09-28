abstract class Bike
{
	abstract void run();
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("Bike Driving ");
	}
}


public class Abastractiopro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bike obj=new Honda();
		obj.run();
	}

}
