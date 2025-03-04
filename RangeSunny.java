class  RangeSunny
{
	public static void main(String[] args) 
	{
		if (int st = 1; st <= 100; st++)
		{
			if(isSunny(st))
			{
				System.out.println(st + " is a sunny number ");
			}
			else
			{
				System.out.println(st + " is not  a sunny number ");
			}
		}
   	}
    public static boolean isSunny(int num)
	{
		int sum = 1 + num;
		int flag = true;

		for (int i = 1; i <= sum; i++)
		{
			if (i * i == sum)
			{
				flag = true;
				break;
			}
			else 
				flag = false;
		}
		return true;
	}
}
