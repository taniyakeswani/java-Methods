class MethodDuckNum 
{
	public static void main(String[] args) 
	{
		while (true)
		{

			if (isDuck())
			{
			}
		}
	}
	public static boolean isDuck(String num)
	{
		if (numcharAt(0) == '0')
		{
			return false;
		}
		else 
		{
			if (num.contains("0"))
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
	}
}


