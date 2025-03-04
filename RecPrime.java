class RecPrime 
{
	public static void main(String[] args) 
	{

		System.out.println(isPrime(7,2));
	}

	public static Boolean isPrime(int num, int den)
	{
		if (num == den)
		{
			return true;
		}
		else if (num % den == 0)
		{
			return false;
		}

		return isPrime(num, ++den);
	}
}
