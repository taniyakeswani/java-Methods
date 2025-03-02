import java.util.Scanner;
class Method2 
{
	public static void main(String[] args) 
	{
		System.out.println(" Main Starts");
		add(10,30);
		division(30,5);
	}
	public static void add(int a, int b)
	{
		System.out.println("Add Starts");
		System.out.println(a+b);
		System.out.println("Add Ends");
	}
	public static void division(int a,int b)
	{
		System.out.println("Division Starts");
		System.out.println(a/b);
		System.out.println("Division Ends");
	}
}