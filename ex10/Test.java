class A
{
	static
	{
		System.out.println("Class Loading...");
	}
	A()
	{
		System.out.println("Object Creating...");
	}

}

class Test
{
	public static void main(String[] args)throws Exception
	{
		Class c = Class.forName("A");
		Object obj = c.newInstance();
	}
}
