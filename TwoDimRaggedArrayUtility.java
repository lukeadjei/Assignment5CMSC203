import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class TwoDimRaggedArrayUtility {	
	
	
	public static double getAverage(double[][] data) {
		int count = 0;
		double total = 0;
		for (int row = 0; row<data.length; row++) {
			for(int col = 0; col<data[row].length; col++) {
				total += data[row][col];
				count++;
			}
		}
		
		return total/count;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0;
		for (int row = 0; row<data.length; row++) {
			for(int column = 0; column<data[row].length; column++) {
				if (col == column) {
					total += data[row][column];
				}
			}
		}
		
		return total;
	}
	
	public static double getHighestInArray(double[][] data) {
		double largest = Double.MIN_VALUE;
		for (int row = 0; row<data.length; row++) {
			for(int col = 0; col<data[row].length; col++) {
				if(data[row][col] > largest) {
					largest = data[row][col];
				}
				
			}
		}
		return largest;
	}
	
	public static double getHighestInColumn(double[][] data, int col) {
		double largest = Double.MIN_VALUE;
		for (int row = 0; row<data.length; row++) {
			for(int column = 0; column<data[row].length; column++) {
				if (col == column) {
					if (data[row][column] > largest) {
						largest = data[row][column];
					}
				
				}
			}
		}
		
		return largest;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col) {
		
		double largest = Double.MIN_VALUE;
		int index = 0;
		for (int row = 0; row<data.length; row++) {
			for(int column = 0; column<data[row].length; column++) {
				if (col == column) {
					if (data[row][column] > largest) {
						largest = data[row][column];
						index = row;
					}
				
				}
			}
		}
		
		return index;
	}
	
	public static double getHighestInRow(double[][] data, int row) {
		double largest = Double.MIN_VALUE;
		for (int rows = 0; rows<data.length; rows++) {
			for(int column = 0; column<data[rows].length; column++) {
				if (rows == row) {
					if (data[rows][column] > largest) {
						largest = data[rows][column];
					}
				
				}
			}
		}
		
		return largest;
	}
	
	
	public static int getHighestInRowIndex(double[][] data, int row) {
		double largest = Double.MIN_VALUE;
		int index = 0;
		for (int rows = 0; rows<data.length; rows++) {
			for(int column = 0; column<data[rows].length; column++) {
				if (rows == row) {
					if (data[rows][column] > largest) {
						largest = data[rows][column];
						index = column;
					}
				
				}
			}
		}
		
		return index;
	}
	
	public static double getLowestInArray(double[][] data) {
		double lowest = Double.MAX_VALUE;
		for (int row = 0; row<data.length; row++) {
			for(int col = 0; col<data[row].length; col++) {
				if(data[row][col] < lowest) {
					lowest = data[row][col];
				}
				
			}
		}
		return lowest;
	}

	public static double getLowestInColumn(double[][] data, int col) {
		double lowest = Double.MAX_VALUE;
		for (int row = 0; row<data.length; row++) {
			for(int column = 0; column<data[row].length; column++) {
				if (col == column) {
					if (data[row][column] < lowest) {
						lowest = data[row][column];
					}
				
				}
			}
		}
		
		return lowest;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col) {
		double lowest = Double.MAX_VALUE;
		int index = 0;
		for (int row = 0; row<data.length; row++) {
			for(int column = 0; column<data[row].length; column++) {
				if (col == column) {
					if (data[row][column] < lowest) {
						lowest = data[row][column];
						index = row;
					}
				
				}
			}
		}
		
		return index;
	}
	
	public static double getLowestInRow(double[][] data, int row) {
		double lowest = Double.MAX_VALUE;
		for (int rows = 0; rows<data.length; rows++) {
			for(int column = 0; column<data[rows].length; column++) {
				if (rows == row) {
					if (data[rows][column] < lowest) {
						lowest = data[rows][column];
					}
				
				}
			}
		}
		
		return lowest;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row) {
		double lowest = Double.MIN_VALUE;
		int index = 0;
		for (int rows = 0; rows<data.length; rows++) {
			for(int column = 0; column<data[rows].length; column++) {
				if (rows == row) {
					if (data[rows][column] < lowest) {
						lowest = data[rows][column];
						index = column;
					}
				
				}
			}
		}
		
		return index;
	}
	
	public static double getRowTotal(double[][] data, int row) {
		double total = 0;
		for (int rows = 0; rows<data.length; rows++) {
			for(int column = 0; column<data[rows].length; column++) {
				if (row == rows) {
					total += data[rows][column];
				}
			}
		}
		
		return total;
	}
	
	
	public static double getTotal(double[][] data) {
		double total = 0;
		for (int row = 0; row<data.length; row++) {
			for(int col = 0; col<data[row].length; col++) {
				total += data[row][col];
			}
		}
		
		return total;
	}
	
	public static double [][] readFile(File file) {
		Scanner scan;
		try {
			scan = new Scanner(file);
			double [][] raggedArray;
			String [][] tempDArray = new String [10][10];
			
			
			int rowCount = 0;
			
			
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				
				String [] rowNumHold = line.split("\\s+");
				for (int i = 0; i<rowNumHold.length; i++) {
					tempDArray[rowCount][i] = rowNumHold[i];
				}
				rowCount++;
			}
			
			
			raggedArray = new double[rowCount][];
			
			int colCount = 0;
			for (int row = 0; row < rowCount; row ++) {
				for (int col = 0; col <tempDArray[row].length; col++) {
					if (tempDArray[row][col] != null) {
						colCount++;
					}
					
				}
				
				if(colCount != 0) {
					raggedArray[row] = new double[colCount];
				}
				colCount = 0;
			}
			
			
			for (int row = 0; row < rowCount; row ++) {
				for (int col = 0; col <tempDArray[row].length; col++) {
					if (tempDArray[row][col] != null) {
						raggedArray[row][col] = Double.parseDouble(tempDArray[row][col]);
					}
				}
			}
			
			
			scan.close();
			return raggedArray;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new double [2][2];
		}
		
	}
	
	public static void writeToFile(double[][] data, File outputfile) {
		try {
			FileWriter pencil = new FileWriter(outputfile);
			
			for (int row = 0; row<data.length; row++) {
				for(int col = 0; col<data[row].length; col++) {
					pencil.write(data[row][col] + " ");
				}
				pencil.write("\n");
			}
			
			pencil.close();
			
		} catch (IOException e) {
			System.out.println("Error opening file");
		}
	}
}
