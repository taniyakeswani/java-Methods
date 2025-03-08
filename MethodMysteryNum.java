import java.util.Scanner;
class MethodMysteryNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter number");
		int num = sc.nextInt();

		if (isMystery (num))
		{
			System.out.println(num + " it is mystery num");
		}
		else 
			System.out.println(num + " it is not mystery num");
	}
	
	public static int rev(int num)
	{
		int rev = 0;
		for (int i = num; i > 0; i/=10)
		{
			rev = rev * 10 + i % 10;
		}
		return rev;
	}

	public static boolean isMystery(int num)
	{
		for (int i = 1; i < num; i++)
		{
			if (i + rev(i) == num)
			{
				return true;
			}
		}
		return false;
	}
}
