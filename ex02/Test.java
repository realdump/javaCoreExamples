import java.io.*;
import java.util.Scanner;
class Test
{
	public static void main(String[] args)throws Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Employee Number	: ");
		int eno = s.nextInt();
		System.out.print("Employee Name       : ");
		String ename = s.next();
		System.out.print("Employee Salary       : ");
		float esal = s.nextFloat();
		System.out.print("Employee Address       : ");
		String eaddr = s.next();
		System.out.println("Employee Details");
		System.out.println("----------------");
		System.out.println("Employee Number: "+eno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+esal);
		System.out.println("Employee Address: "+eaddr);
	}

}
