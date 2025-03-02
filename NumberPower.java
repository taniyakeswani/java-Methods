import java.util.Scanner;
class NumberPower 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Enter a power :  ");
		int power = sc.nextInt();

		int op = 1; 

		for (int i = 1; i <= power ; i++ )
		{
			op *= num;
		}

        System.out.println(num + " ^ " + power + " = " + op);
		System.out.println(num + " ^ " + power + " = " + (int) (Math.pow(num,power)));       // In-Built method in javascript
	}
}
