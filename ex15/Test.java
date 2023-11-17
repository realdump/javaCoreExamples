class Test
{
	public static void main(String[] args)throws Exception
	{
		System.out.println("Inside Before Try");
		try
		{
			System.out.println("Inside try, b4 exception");
			int i=100;
			int j=0;
			float f=i/j;
			System.out.println("Inside try, aft exception");
		}
		catch(Exception e)
		{
			System.out.println("Inside catch");
		}
		finally
		{
			System.out.println("Inside finally");
		}
		System.out.println("Inside after finally");
	}
}

