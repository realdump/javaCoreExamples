class A
{
	int i = 10;
	static int j = 20;
	static void m1()
	{
		System.out.println("m1-A");
		//System.out.println(i);
		System.out.println(j);
		A a = new A();
		System.out.println(a.i);
		//
		//System.out.println(this.j);
	}
}
class Test
{
	public static void main(String[] args)throws Exception
	{
		A a = new A();
		a.m1();
		A.m1();
	}
}

