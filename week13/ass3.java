
import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String inputText;

            do {
                System.out.print("Input the text. To finish inputting, input END: ");
                inputText = scanner.nextLine().trim();

                if (!inputText.equalsIgnoreCase("END")) {
                    int charCount = inputText.length();
                    int weight = calculateWeight(inputText);

                    System.out.println(inputText + " has " + charCount + " characters, and its weight is " + weight);
                }
            } while (!inputText.equalsIgnoreCase("END"));

            System.out.println("Thank you for using the program.");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int calculateWeight(String text) {
        int weight = 0;
        for (char c : text.toCharArray()) {
            weight += (int) c;
        }
        return weight;
    }
}

