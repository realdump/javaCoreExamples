import java.io.*;
class Test
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("User Name: ");
		String uname = br.readLine();
		System.out.print("Password: ");
		String upwd = br.readLine();
		if(uname.equals("abdul") && upwd.equals("redhat"))
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Fail");
		}
	}
}
