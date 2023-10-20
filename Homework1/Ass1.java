
public class Ass1 {

	public static void main(String[] args) {
		 
		double randomDecimal = Math.random() * 100;
		
		int integerPart = (int) randomDecimal;
		double decimalPart = randomDecimal - integerPart;
		
		char charFromIntegerPart = (char) integerPart;
		
		System.out.printf(" From 0...100, the computer picked %.2f%n ", randomDecimal);
		System.out.printf("Integer part of this number is %d%n", integerPart);
		System.out.printf(" Decimal part of this number is %.2f%n", decimalPart);
		System.out.printf(" Character with code: %d is: %c%n", integerPart, charFromIntegerPart);

	}
}
