class StatBlock1 
{
	static
	{
		System.out.println(" from static 1");
	}
	public static void main(String[] args) 
	{
		System.out.println("From Main");
	}
	static
	{
		System.out.println(" from static 2");
	}
	static
	{
		System.out.println(" from static 3");
	}
}
