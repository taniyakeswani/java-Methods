class StatVar4 
{
	static String s;
	public static void main(String[] args) 
	{
		System.out.println(s);
		demo();
		String s = "Taniya";
		System.out.println(s);     
		System.out.println(StatVar4.s);
	}

	public static void demo()
	{
		s = "Qspiders";
		System.out.println(s);
	}
}
