package exceptionHandling;

public class Finallykeyword {

	public static void main(String[] args) {
		
		try {
			System.out.println("Discconect the machine from internet");
			System.out.println("Verify that xxxxxxxx message is displayed");
			System.out.println(10/0);
			
			//System.out.println("Connecti the machine to the internet");
			
			
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
			//System.out.println("Connecti the machine to the internet");
			
		}finally {
			System.out.println(("Connect the machine to the internet"));
		}

	}

}
