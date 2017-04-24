package app;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This analyzes SOME DATA.
 * 
 * @author YOUR NAME
 *
 */
public class DataAnalyzer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// Declarations
		File f = new File("NAME.csv"); // TODO: update filename to the one
										// you want to analyze.
		Scanner scan = new Scanner(f);
		ArrayList<Data> list = new ArrayList<>(); // TODO: if you renamed the
													// Data object, you need to
													// update it here, too.

		// Read data from the input file and add to an ArrayList
		// TODO: you write code here

		// (Initiative) Sort the ArrayList. You will need a new ArrayList to hold the sorted
		// items.
		// TODO: you write code here

		// Display results of the sorted list.
		// TODO: you write code here

		// Clean up
		scan.close();
	}

}
