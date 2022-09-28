import java.util.Scanner;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String name)
	{
		super(name);
		
	}
}
class Check
{
	static void canvote(int age) throws InvalidAgeException
	{
		if(age>=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			InvalidAgeException obj=new InvalidAgeException("Invalid Age");
			throw obj;
		}
	}
}
public class AgeProblme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter yout age");
		int age=scan.nextInt();
		try {
			Check.canvote(age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
		
	}

}
