import java.io.*;
import java.util.Scanner;
class Test
{
	public static void main(String[] args)throws Exception
	{

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Text Data : ");
		String data1 = s.nextLine();
		System.out.println("Enter the Same data again: ");
		String data2 = s.next();
		System.out.println("nextLine()	: "+data1);
		System.out.println("next()	: "+data2);
	}

}
