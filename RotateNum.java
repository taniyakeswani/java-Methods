class RotateNum 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int last = num % 10;       //4
		num /= 10;
        int ct = 0;

		for (int i = num; i > 0; i /= 10)
			   ct++;

        int pow = 1;
		for (int j = 1; j <= ct ; j++ )
		{
			   pow *= 10;
	    }
		 last *= pow;
		 last += num;
		System.out.println(last);
	}
}