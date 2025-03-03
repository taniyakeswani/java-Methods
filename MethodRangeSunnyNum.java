class MethodRangeSunnyNum 
{
	public static void main(String[] args) 
	{
		for (int st = 1; st <= 100; st++)
		{
			if(isSunny(st))
			{
				System.out.println(st + " is a sunny number ");
			}
		
		}
   	}
       public static boolean isSunny(int num)
	{
		int sum = num+1;
		boolean flag = true;

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
		return flag;
	}
}