import java.util.Scanner;
interface client
{
	void input();
	void output();
}
class divya implements client
{
	String name;
	double salary;
	Scanner sc = new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter your name:");
		name=sc.next();
		System.out.println("Enter your salary:");
		salary=sc.nextDouble();
	}
	public void output()
	{
		System.out.println("Enter your name:"+name);
		System.out.println("Enter your salary:"+salary);

		
	}
	public static void main(String[] args)
	{
		client C=new divya();
		C.input();
		C.output();
	}
}
