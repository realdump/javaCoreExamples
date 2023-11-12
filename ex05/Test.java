import java.io.*;
class Test
{
	public static void main(String[] args)throws Exception
	{
		Console c = System.console();
		String uname = c.readLine("User Name : ");
		char[] pwd = c.readPassword("Password : ");
		String upwd = new String(pwd);
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
