
public class Ass1 {

	public static void main(String[] args) {
		
		 String myString = "Computer";
         char firstChar = myString.charAt(0);
         char lastChar = myString.charAt(myString.length()-1);
         char middleChar;

         if(myString.length()%2 == 0) {
                 middleChar = myString.charAt(myString.length()/2);
         }
         else {
                 middleChar = myString.charAt((myString.length()/2)-1);
         }

         System.out.println("Original: " + myString);
         System.out.println("Length: " + myString.length());
         System.out.println("In small letters: " + myString.toLowerCase());
         System.out.println("In capital letters: " + myString.toUpperCase());
         System.out.println("First letter: " + firstChar);
         System.out.println("Middle letter: " + middleChar);
         System.out.println("Last letter: " + lastChar);
         System.out.println("The word starts with 'Com': " + myString.startsWith("Com"));
         System.out.println("The word starts with 'Com': " + myString.endsWith("ion"));
         System.out.println("The first two letters are: " + myString.substring(0,2));
         System.out.println("Swapping 'e' with 'o': " + myString.replace('e', 'o'));
         System.out.println("Swapping 'Comp' with 'Calcula': " + myString.replaceFirst("Comp", "Calcula"));
		 	

	}

}
