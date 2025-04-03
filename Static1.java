class Static1
{
	static
	{
		test();
	}
	public static void main(String[] args)
	{
		System.out.println("Main 1");
	}

	public static void test()
	{
		System.out.println("test method");
	}
}