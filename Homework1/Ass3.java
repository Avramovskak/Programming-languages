
public class Ass3 {

	public static void main(String[] args) {
		
		String inputString = "Kristina Avramovska";
		
		char firstChar = inputString.charAt(0);
		char lastChar = inputString.charAt(inputString.length() - 1);
		
		char middleChar = inputString.charAt(inputString.length() / 2);
		int middleCharPosition = inputString.length() / 2;
		
		int stringLength = inputString.length();
		if (stringLength % 2 == 0) {
			int middleIndex = stringLength / 2 - 1;
			middleChar = inputString.charAt(middleIndex);
			middleCharPosition = middleIndex;
			
		}
		
		int sumOfCharacters = (int) firstChar + (int) lastChar + (int) middleChar;
		
		char biggestValueChar;
		if (firstChar > lastChar && firstChar > middleChar) {
			biggestValueChar = firstChar;
		}
		else if (lastChar > middleChar ) {
			biggestValueChar = lastChar;
		}
		else { 
			biggestValueChar = middleChar;
		}
		System.out.println("My string is: " + inputString);
		System.out.println("Its first character is " + firstChar);
		System.out.println("Its last character is " + lastChar);
		System.out.println("Its middle character is " + middleChar );
		System.out.println("The sum of these characters is " + sumOfCharacters);
		System.out.println("The biggest character of these three is:" + biggestValueChar + " with code of " + (int) biggestValueChar );
		
	}
	}
