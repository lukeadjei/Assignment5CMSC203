import java.io.File;


public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\boomc\\Downloads\\Assignment5_holidayBonis_st\\Assignment5_holidayBonis_st\\dataSet3.txt");

		
		double[][] result = TwoDimRaggedArrayUtility.readFile(file);
		
		
		for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
            
            		System.out.print(result[row][col] + " ");
            }
                 // Print each value in the row
            System.out.println();
        }
           
		 System.out.println(TwoDimRaggedArrayUtility.getHighestInRowIndex(result, 0));
		
			
     }
}


