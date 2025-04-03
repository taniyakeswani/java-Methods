import java.util.*;
class Restaurant1
{
	static String name;
	static long contact;
	static String address;
	static ArrayList<String> basket = new ArrayList<>();

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for(; ;)
		{
			System.out.println();
			System.out.println("           JAVA KA DHABA");
			System.out.println();
			System.out.println("1. Create Account");
			System.out.println("2. Existing User");
			System.out.println();
			System.out.println("Enter an option : ");
			int opt  = sc.nextInt();
			System.out.println();
			switch(opt)
			{
			case 1: createAccount(sc);break;
			case 2: login(sc);break;
			default: System.out.println("INVALID INPUT");
				break;

			}
		}	
	}

	public static void createAccount(Scanner sc)
	{
		System.out.println("          REGISTRATION");
		System.out.println();
		System.out.println("Name : ");
	    name = sc.next();
		System.out.println("Phone : ");
		contact = sc.nextLong();
		System.out.println("Address : ");
		sc.nextLine();
		address = sc.nextLine();
		System.out.println();
		System.out.println("ACCOUNT CREATED SUCCESSFULLY");
	}

	public static void login(Scanner sc)
	{
		if(name == null)
		{
			System.out.println("CREATE YOUR ACCOUNT FIRST");
			return;  //calling method(main)
		}
		System.out.println("    LOGIN");
		System.out.println();

		for(int attempt = 3; attempt>=1; attempt--)
		{
			System.out.print("Username : ");
			String username = sc.next();
			System.out.print("Password : ");
			long phone = sc.nextLong();
			System.out.println();
			if(name.equals(username) && contact == phone)
			{
				homePage(sc);
			}
			else{
				System.out.println("INVALID CREDENTIALS");
				System.out.println("ATTEMPT LEFT : " +(attempt-1));
				System.out.println();
			}
		}
		System.out.println("THANK U & NEVER VISIT AGAIN");
		System.exit(0);  //terminate the execution
	}

	public static void homePage(Scanner sc)
	{
		for(;;)
		{

		System.out.println("     HOME PAGE");
		System.out.println();
		System.out.println("1. Menu");
		System.out.println("2. Order");
		System.out.println("3. Table Booking");
		System.out.println("4. Logout");
		System.out.println();
		System.out.println("Enter an option : ");
		int opt = sc.nextInt();

		switch(opt)
		{
		    case 1: menu(sc);break;
		    case 2: order(sc);break;
		    case 3: tableBooking();break;
		    case 4: System.out.println("THANK  U & VISIT AGAIN");
			    System.exit(0);break;
	        default: System.out.println("Invalid INPUT");break;
		}
	    }
    }
    public static void menu(Scanner sc)
    {
    	for(;;)
    	{
    		System.out.println();
    		System.out.println("      MENU");
    		System.out.println("101 : Chinese_Bhel = 250/-");
    		System.out.println("102 : Pav_Bhaji = 120/-");
    		System.out.println("103 : Paneer_Butter_Masala = 350/-");
    		System.out.println("104 : Veg_Maratha = 300/-");
    		System.out.println("105 : Roti = 35/-");
    		System.out.println("106 : Exit Menu");
    		System.out.println();
    		System.out.println("Enter an food id : ");
    		int id = sc.nextInt();
    		switch(id)
    		{
    		case 101:{
    			basket.add("101 : Chinese_Bhel = 250/-");
    			System.out.println("Chinese Bhel Added in Basket");
    			break;
    		}
    		case 102:{
    			basket.add("102 : Pav_Bhaji = 120/-");
    			System.out.println("Pav bhaji added in basket");
    			break;
    		}
    		case 103:{
    			basket.add("103 : Paneer_Butter_Masala = 350/-");
    			System.out.println("Paneer Butter Masala added in basket");
    			break;
    		}
    		case 104:{
    			basket.add("104 : Veg_Maratha = 300/-");
    			System.out.println("Veg Maratha Added in Basket");
    			break;
    		}
    		case 105:{
    			basket.add("105 : Roti = 35/-");
    			System.out.println("Roti Added in Basket");
    			break;
    		}
    	   case 106:{
    	   	return;
    	   }
    	   default:{
    	   	System.out.println("Invalid Food Id ");
    	   	break;
    	   }
    		
    	   }
    	}
    
    }
    public static void order(Scanner sc)
    {
    	System.out.println();
    	System.out.println("      ORDERS");
    	System.out.println();
    	if(basket.size()==0){
    		System.out.println("BASKET IS EMPTY, ADD FOOD ITEMS");
    	}
    	for(String foodItem : basket)
    	{
    		System.out.println(foodItem);
    	}
    	System.out.println();
    	System.out.println("1. Cancel Order");
    	System.out.println("2. Remove Food Item");
    	System.out.println("3. Proceed to Payment");
    	System.out.println();
    	System.out.println("Enter the option : ");
    	int opt =sc.nextInt();
    	System.out.println();
    	switch(opt)
    	{
    	case 1:{
    		System.out.println("Order Cancelled");
    		basket.clear();
    		break;
    	}
        case 2:{
    		System.out.println("Enter foodId : ");
    		int foodId = sc.nextInt();
    		removeFoodId(foodId);
    		break;
    	}
        case 3:{
        	billGenerate();
        	break;
    	}
    }
    }

    public static void removeFoodId(int foodId)
    {
    	ArrayList<String> dupBasket = new ArrayList<>(basket);
    	int indx = 0;
    	boolean flag = false;
    	for(String foodItem : dupBasket)
    	{
    		String[]arr = foodItem.split(" ");
    		if(arr[0].equals(foodId+""))
    		{
    			dupBasket.remove(indx);
    			flag = true;
    			System.out.println("FOOD ITEM REMOVED");
    		}
    		indx++;
    	}
    	if(!flag)
    		System.out.println("FOOD ITEM DOESN'T EXIXT IN BASKET");

    	basket = dupBasket;
    }


    public static void tableBooking()
    {
    	System.out.println();
    	System.out.println(" Table Booking");
    	System.out.println();
    }

    public static void billGenerate()
    {
    	double totalBill = 0;
    	for(String foodItem : basket)
    	{
    		String[]arr = foodItem.split(" ");
    		totalBill += Double.parseDouble(arr[4]);
    	}
    	System.out.println("Total Bill : "+ totalBill+ " rs.");
    }

}