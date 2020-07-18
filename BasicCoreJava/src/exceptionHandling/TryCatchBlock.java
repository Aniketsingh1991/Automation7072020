package exceptionHandling;



public class TryCatchBlock {

	private static Functions fun;

	public static void main(String[] args) {
		// 1st Exception
		
		try {
		int a = 10;
		int b = 0;
		System.out.println(a / b);	
	} catch (Exception e) {
		
		System.out.println("Exception Occurred:"+ e.getLocalizedMessage());
	}
		// 2nd Exception
		
	try {
		
		String[] str = new String[2];
        str[2] = "Anand";
	} catch (Exception e) {
		System.out.println("Exception Occurred:"+ e.getLocalizedMessage());
	}
	    // 3rd Exception	
		fun.fun1();
	}

}
