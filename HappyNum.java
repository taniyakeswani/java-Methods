class HappyNum
{
	public static void main(String[] args) 
	{
        int i = 1;
		while (i <= 100)
		{
			if (isHappy(i))
			{
				System.out.println(i);
			}
			i++;
		}
	}

	public static boolean isHappy(int num)
	{
		int sum = sumOfSqOfDigit(num);
		while (sum != 1 && sum != 4)
		{
			sum = sumOfSqOfDigit(sum);
		}
		return sum == 1? true : false;
	}

	public static int sumOfSqOfDigit(int num)
	{
		int sum = 0;
		while (num != 0)
		{
			int last = num % 10;
			sum += (last * last);
			num /= 10;
		}
		return sum;
	}
}
