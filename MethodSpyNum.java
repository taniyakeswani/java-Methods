class MethodSpyNum 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i < 100; i++)
		{
			if (isSpyNum(i))
			{
				System.out.println(i);
			}
		}
	}

	public static boolean isSpyNum(int num)
	{
		int sum = 0;
		int product = 1;
		for (int i = num; i > 0; i /= 10)
		{
			int rem = i % 10;
			sum += rem;
			product *= rem;
		}
		return sum == product;
	}
}
