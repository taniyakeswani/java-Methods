class MethodPronicNum 
{
	public static void main(String[] args) 
	{

		System.out.println(isPronic(10));
	}

	public static boolean isPronic(int num)
	{
		for (int i = 1; ; i++)
		{
			if (i * (i + 1) == num)
			{
				return true;
			}
			else if (i * (i + 1) > num)
			{
				return false;
			}
		}
	}
}