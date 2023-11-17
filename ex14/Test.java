class Test
{
	public static void main(String[] args)throws Exception
	{
		try
		{
			int i=100;
			int j=0;
			float f=i/j;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		finally
		{
		}
	}
}

