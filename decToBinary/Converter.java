package decToBinary;

public class Converter {
	// Constructor
	public Converter() {}
	// Recursive method
	public String toBinary(int num) {
		if (num == 0) return "";
		return toBinary(num/2) + (num%2);
	}
}
