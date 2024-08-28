import java.util.Scanner;
interface Tourism
{
	void input();
	void output();
}
class Trip implements Tourism
{
	String name;
	String loc;
	int duration;
	double budget;
	
	Scanner sc=new Scanner(System.in);

		public void input()
		{
			System.out.println("Enter your name:");	
			name=sc.next();
			System.out.println("Enter the no. of days");
			duration=sc.nextInt();
			System.out.println("Enter your budget");
			budget=sc.nextDouble();
		}
		public void output()
		{
			if(budget<=1500)
			{
				System.out.println("Your budget is too low...Sorry!");
			}
			else if(budget>2000 && budget<=3000)
			{
				System.out.println("Best trip for you: MAHABALESHWAR-PRATAPGARH FORT-DHOBI WATERFALL");
			}
			else if(budget>3001 && budget<=4000)
			{
				System.out.println("Best trip for you: ALIBAG-KOLABA FORT-NAGAON BEACH");
			}
			else if(budget>4001 && budget<=5000)
			{
				System.out.println("Best trip for you: ELLORA CAVES-DAULATABAD FORT-AJANTA CAVES-BIBI KA MAQBARA");
			}
			else if(budget>10000)
			{
				System.out.println("Best trip for you: UDAYPUR-RAJASTHAN");                                                                                                                                                                                                                                                                      
			}
			else
			{
				System.out.println("Suggestion not found"); 
			}    
		}
	public static void main(String[] args)
	{
		Tourism T=new Trip();
		T.input();
		T.output();
	}
}			