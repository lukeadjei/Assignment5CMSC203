
public class HolidayBonus {
	public static final int highestBonus = 5000;
	public static final int lowestBonus = 1000;
	public static final int middleBonus = 2000;
	
	
	public static double [] calculateHolidayBonus(double [][] data) {
		
		double highest = TwoDimRaggedArrayUtility.getHighestInArray(data);
		double lowest = TwoDimRaggedArrayUtility.getLowestInArray(data);
		

		
		int newLength = 0;
		
		for (int row = 0; row < data.length; row++) {
			newLength += data[row].length;
		}
		
		double [] newArray = new double [newLength];
		
		int count = 0;
		
		for (int row = 0; row < data.length; row++) {
			int highestRowIndex = TwoDimRaggedArrayUtility.getHighestInRowIndex(data, row);
			int lowestRowIndex = TwoDimRaggedArrayUtility.getLowestInRowIndex(data, row);
			newArray[highestRowIndex] += highestBonus;
			newArray[lowestRowIndex] += lowestBonus;
			for (int col = 0; col < data[row].length; col++) {
				if(newArray[count] == 0.0) {
					newArray[count] += middleBonus;
				}
				
			}
		}
		
		
		
		return newArray;
		
	}
	
	public static double calculateTotalHolidayBonus(double [][] data) {
		double [] array = calculateHolidayBonus(data);
		double total = 0;
		
		for (int i = 0; i< array.length; i++) {
			total += array[i];
		}
		
		return total;
	}
}
