class A
{
	static int i = 10;
	void m1()
	{
		//static int j=20; --> Error
		System.out.println("m1-A");
		System.out.println(this.i);
	}
}
class Test
{
	public static void main(String[] args)throws Exception
	{
		A a = new A();
		System.out.println(a.i);
		System.out.println(A.i);
		a.m1();
	}
}

