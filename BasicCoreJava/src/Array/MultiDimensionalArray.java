package Array;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		String[][] data = new String[10][2];

		// row1
		data[0][0] = "User1";
		data[0][1] = "Password1";

		// row2
		data[1][0] = "User2";
		data[1][1] = "Password2";

		// row3
		data[2][0] = "User3";
		data[2][1] = "Password3";

		// row4
		data[3][0] = "User4";
		data[3][1] = "Password4";

		// row5
		data[4][0] = "User5";
		data[4][1] = "Password5";

		// row6
		data[5][0] = "User6";
		data[5][1] = "Password6";

		// row7
		data[6][0] = "User7";
		data[6][1] = "Password7";

		// row8
		data[7][0] = "User8";
		data[7][1] = "Password8";

		// row9
		data[8][0] = "User9";
		data[8][1] = "Password9";

		// row10
		data[9][0] = "User10";
		data[9][1] = "Password10";
	
		for (int r=0; r<data.length; r++){
			
		for (int c=0; c<data[r].length; c++){
			
			System.out.println(data[r][c]+" ");
		}
			System.out.println();
		}
		}
		
	
	}


