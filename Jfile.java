import java.io.*;

class Jfile{

public static void main(String[]args)
{
	File f1 =new File("D:\\divya\\purple.txt");
	try
	{
		f1.createNewFile();
		System.out.println("File created");
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	try
	{
	FileWriter writer = new FileWriter("D:\\divya\\purple.txt");
	writer.write("Any Body Can Dance, But not anyone can dance as marvelous as me *_*");
	writer.close();
	System.out.println("File updated");
	}
	catch(IOException e)
	{
		System.out.println("Error Occured"+e);
	}
	try
	{
	FileReader f2 = new FileReader("D:\\divya\\purple.txt");
		BufferedReader br = new BufferedReader(f2);
		int i;
		while((i = br.read())!= -1)
		{
			System.out.print((char)i);
		}
	}
	catch(IOException e)
	{
		System.out.println("Error occured");
	}
  
			
	
}
}