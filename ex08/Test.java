class A
{
	int i = 10;
	static int j=20;
	static
	{
		System.out.println("SB-A");
		//system.out.println(i); -->error
		A a = new A();
		System.out.println(a.i);
		System.out.println(j);
	}
}

class Test
{
	public static void main(String[] args)
	{
		A a = new A();
	}
}
