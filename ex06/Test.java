class A
{
	static int i = 10;
}
class Test
{
	public static void main(String[] args)throws Exception
	{
		A a = new A();
		System.out.println(a.i);
		System.out.println(A.i);
	}
}

