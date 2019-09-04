import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Math;
import java.util.Scanner;
import java.io.PrintWriter;

public class pythagtriple {
	public static void main (String [] args) throws FileNotFoundException, IOException {
			
		Scanner input = new Scanner(System.in);
		File outFile = new File("pythagouts.txt");
		PrintWriter output = new PrintWriter(outFile);
		
		try {
		
			output.print(" A   B   C \n");
			output.print(" -   -   - \n");
			output.print("\n");
			double sol;
			int isol;

			System.out.println("From range of numbers (0 to _) would you like to find Pythagorean Triple Combinations?");
			int limit = input.nextInt();
			
			//tests every combination of integers within limit to see if they are pythagorean triples
			for (int a = 1; a < limit; a++) {
				for(int b = 1; b < limit; b ++) {
					
				sol = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
				isol = (int)(Math.round(sol));
				
				if (sol == isol) {
					output.print(a + "   " + b + "   " + isol + "\n");
				}
				}
				
			}
			
			System.out.println("Data written to file.");
			output.close();
			
		
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage()); 
			
		} catch (IOException e) {
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage()); }

	}
}
