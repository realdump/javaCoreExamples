import java.io.*;
class A
{
	void add()throws Exception
	{
		concat();
	}
	void concat()throws Exception
	{
		append();
	}
	void append()throws IOException
	{
		throw new IOException("My Exception");
	
	}
}
class Test
{
	public static void main(String[] args)throws Exception
	{
		A a = new A();
		a.add();
	}
}
