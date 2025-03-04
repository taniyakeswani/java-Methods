import java.util.Scanner;
class RecursiceFactorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a number ");
		//int n = sc.nextInt();
		System.out.println(fact(sc.nextInt()));
	}

	public static int fact(int num)
	{
		if (num == 0)
		{
			return 1;
		}
		return num * fact(num-1);
	}
}