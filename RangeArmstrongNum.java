class RangeArmstrongNum 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10000; i++)
		{
			if (isArmstrong(i))
			{
				System.out.println(i);
			}
		}
	}


	public static boolean isArmstrong(int num)
	{
		int len = 0;
		for (int i = num; i > 0 ; i/=10 )
		{
			len++;
		}

		int sum = 0;
		for (int j = num; j > 0 ; j /= 10)
		{
			int rem = j % 10;
			int pow = 1;
			for (int i = 1; i <= len; i++ )
			{
				pow *= rem;
			}
			sum += pow;
		}
		return sum == num;
	}
}
