class Method1 
{
	public static void main(String[] args) 
	{
		maths(2, 3);
		prime(23);
	}
    
	// performs mathematical operations
	public static void maths(int a, int b)
	{
		int sum = a + b;
		System.out.println(a + " + " + b  + " = " + sum);
		int subtract = a - b;
		System.out.println(a + " - " + b  + " = " + subtract);
		int product = a * b;
		System.out.println(a + " * " + b  + " = " + product);
	}

	// checks prime or not
	public static void prime(int num)
	{
		int den = 2;
		while (den < num)
		{
			if (num < den)
			{
				System.out.println(num + " is not prime ");
			}
			if (num % den == 0)
			{
				break;
			}
			den++;
			if (den == num)
			{
				System.out.println(num + " is prime");
			}
		}
	}
}
