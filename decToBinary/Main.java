package decToBinary;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Converter converter = new Converter();
		Scanner input = new Scanner(System.in);
		
		boolean cont = true;
		while(cont) {
			int decNum = -1;
			while (decNum < 1) {
				System.out.println("Please enter a decimal integer (greater than zero): ");
				// Take in user input and find first integer value (if any)
				String userInput = input.nextLine();
				Scanner thisValue = new Scanner(userInput);
				while (thisValue.hasNext()) {
					if (thisValue.hasNextInt()) {
						decNum = thisValue.nextInt();
						break;
					}
					thisValue.next();
				}
				thisValue.close();
			}
			// Print out converted number
			System.out.println(decNum + " in binary is: " + converter.toBinary(decNum));
			// Ask user if they would like to continue
			boolean valid = false;
			while (!valid) {
				System.out.println("Convert another number? (y/n): ");
				String userInput = input.nextLine().toLowerCase();
				// Verify input is valid then execute 
				if (userInput.equals("n")) {
					cont = false;
					valid = true;
				} else if (userInput.equals("y")) {
					valid = true;
				} else {
					System.out.println("Please enter 'y' or 'n'.");
				}
			}
		}
		
		System.out.println("Time complexity of this conversion algorithm: O(n)");

	}

}
