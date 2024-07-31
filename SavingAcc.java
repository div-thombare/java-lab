class Customer
{
private double Balance,interest,total;
private static double IntRate;
 Customer(double amount)
{
this.Balance=amount;
}
static void annuInt(double rate)
{
IntRate=rate;
}
void calcu()
{
interest=(Balance*IntRate/12)/100;
System.out.println(interest);
Balance+=interest;
}
void show()
{
System.out.println("Your acc balance:"+Balance);
}
}

class SavingAcc
{
public static void main(String args[])
{
Customer cu1=new Customer(25000);
Customer cu2=new Customer(2);
System.out.println("your bank balance with 4%");
Customer.annuInt(4.0);
cu1.calcu();
cu1.show();
cu2.calcu();
cu2.show();

System.out.println("your bank balance with 5%");
Customer.annuInt(5.0);
cu1.calcu();
cu1.show();
cu2.calcu();
cu2.show();


}

}