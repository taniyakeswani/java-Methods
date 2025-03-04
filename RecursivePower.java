import java.util.Scanner;
class RecursivePower
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter  base and power ");
		System.out.println(power(sc.nextInt(), sc.nextInt()));
	}

	public static int power(int base, int raise)
	{
		if (raise == 0)
		{
			return 1;
		}

		return base * power(base , raise-1);
	}
}
