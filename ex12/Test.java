import java.io.*;
class Test
{
	public static void main(String[] args)throws Exception
	{
		FileInputStream fis = new FileInputStream("/home/abdul/Documents/GitHub/javaCoreExamples/ex12/abc.txt");
		int size = fis.available();
		byte[] b = new byte[size];
		fis.read(b);
		String data = new String(b);
		System.out.println(data);
		fis.close();
	}
}

