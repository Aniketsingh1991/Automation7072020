package stringClass;

public class Assignment {

	public static void main(String[] args) {
	
		String name="anand";
		
		
		/*
		 * int count=0; for (int iter=0; iter<str.length(); iter++) { if
		 * (str.charAt(iter)=='a'|| str.charAt(iter)=='A') { count++;
		 * 
		 * 
		 * } } System.out.println(count);
		 */
	
		String[] arr= name.split("");
		
		System.out.println(arr.length);
	
		int count=0;
		for(String p:arr)

		{
			if(p.contentEquals("a"))
				count++;
			
		}
		System.out.println("Total Number of a="+count);
		
	}

}
