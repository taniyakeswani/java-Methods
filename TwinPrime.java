class MethodTwinPrime 
{
	public static void main(String[] args) 
	{
		int n1 = 3, n2 = 5;
		int diff = n1 > n2 ? (n1 - n2) : (n2 - n1);
		if (diff == 2)
		{
			if (isPrime(n1) && isPrime(n2))
			{
				System.out.println(n1 + " and " +  n2 + " are TwinPrime");
			}
			else 
				System.out.println(n1 + " " + n2 + " are not TwinPrime");
		}
	}

	public static Boolean isPrime(int num)
	{
		int den = 2;
		for (; den < num ; den++)
		{
			if (num % den == 0 )
			{
				return false;
			}
		}
		return true;
	}
}