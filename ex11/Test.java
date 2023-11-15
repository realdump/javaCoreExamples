import java.io.*;
class Test
{
	public static void main(String[] args)throws Exception
	{
		FileOutputStream fos = new FileOutputStream("/home/abdul/Documents/GitHub/javaCoreExamples/ex11/abc.txt",true); //for appending use true
		String data = "Welcome to DS";
		byte[] b = data.getBytes();
		fos.write(b);
		System.out.println("Data Transfered");
		fos.close();
	}
}
