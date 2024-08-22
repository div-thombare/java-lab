import java.util.Scanner;
class Exception
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Program is started");

		int dividend[]= new int[5];
		int reminder[]= new int[5];
		int divisor;

		System.out.println("Enter dividends:");
		for(int i=0;i<5;i++)
		{
			dividend[i]=sc.nextInt();
		}

		System.out.println("Enter divisor:");
		divisor=sc.nextInt();
		for(int i=0;i<5;i++)
		{
		try
		{
		System.out.println("Your Solution:");
		reminder[i]=dividend[i]/divisor;
		System.out.println(reminder[i]);

		}
		catch(Exception e)
		{
		System.out.println("Envalid");
		}}
		System.out.println("Program is ended");
		
	}
}
