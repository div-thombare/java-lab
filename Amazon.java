import java.util.Scanner;

class Employee
{
	private String name;
	private double salary;
	private int emId;

Employee(String Em_name,double Em_salary,int Em_Id)
{
	this.name=Em_name;
	this.salary=Em_salary;
	this.emId=Em_Id;
}
	public String getNm()
	{
		return name;
	}
	public double getSal()
	{
		return salary;
		
	}
	public int getId()
	{
		return emId;
	}
	void raise_Salary()
	{
		this.salary=salary*1.10;
	}

	
}
class Amazon
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String Em_name;
		double Em_salary;
		int Em_Id;
		System.out.println("Enter your name:");
		Em_name=sc.next();
		System.out.println("Enter your salary:");
		Em_salary=sc.nextDouble();
		System.out.println("Enter your I'D:");
		Em_Id=sc.nextInt();
			Employee Em= new Employee(Em_name,Em_salary,Em_Id);
			System.out.println("Your name:"+Em.getNm());
			System.out.println("Your salary:"+Em.getSal());
			System.out.println("Your I'D:"+Em.getId());
			Em.raise_Salary();
			System.out.println("Updated Salary:"+Em.getSal());
	}

}

