import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        do {
            System.out.print("Input the text. To finish inputing (input END): ");
            String text = scanner.nextLine();

            if (text.equals("END")) {
                break;
            }

            int length = text.length();
            int weight = calculateWeight(text);

            System.out.println( text + "has " + length + "characters and  its weight is " + weight );
            
        } while (true);

      
        while (true) {
            System.out.print("Input the text. To finish inputing (input END): ");
            String text = scanner.nextLine();

            if (text.equals("END")) {
                break;
            }

            int length = text.length();
            int weight = calculateWeight(text);

            System.out.println( text + "has " + length + "characters and  its weight is " + weight );
        }

      
        while (true) {
            System.out.print("Input the text. To finish inputing (input END): ");
            String text = scanner.nextLine();

            if (text.equals("END")) {
                break;
            }

            
            int length = text.length();
            int weight = calculateWeight(text);

            System.out.println( text + "has " + length + "characters and  its weight is " + weight );
        }

        scanner.close();
    }

    
    private static int calculateWeight(String text) {
        int weight = 0;
        for (char c : text.toCharArray()) {
            weight += (int) c;
        }
        return weight;
    }
}
