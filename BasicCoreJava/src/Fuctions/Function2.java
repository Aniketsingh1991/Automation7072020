package Fuctions;

public class Function2 {

	public static String name="Aniket";
	
	public static void main(String[] args) {
		// Method overloading is where two or more function with different data type.

		
		sum(10,20);
		
		sum(20,30);
		
		sum(40,50,10);
		
		message ("Aniket");
		
		eligiblity("Aniket",28);
		
		eligiblity("Pratik",17);
		
		System.out.println(name);
	}
	
   public static void sum(int a,int b)
   {
	   System.out.println(a+b);
   }
   
   public static void sum(int a, int b, int c)
   {
	   System.out.println(a+b+c);
   }
   public static void message(String name)
   {
	   System.out.println("Welcome"+name);
   }
   public static void eligiblity(String name,int age)
   
   {
	   System.out.println("Aniket You Are Eligible");
   }
   {
	   System.out.println("abc You Are Not Eligible");
   }

	}


