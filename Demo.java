class mobile
{
String brand;
int price;
static String name;

void show()
{
System.out.println("Brand"+brand);
System.out.println("Price"+price);
System.out.println("Name"+name);
}}
class Demo
{
public static void main(String args[])
{
mobile m1=new mobile();
mobile m2=new mobile();
m1.brand="Poco";
m1.price=17000;
m1.name="phone";
m2.brand="One Plus";
m2.price=25000;
m2.name="Cell phone";
m1.name="Smartphone";

m1.show();
m2.show();
}}