import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Number of rows: ");
            int rows = scanner.nextInt();

            System.out.print("Number of columns: ");
            int columns = scanner.nextInt();

            
            int[][] field = new int[rows][columns];

            
          
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("el. [" + i + "][" + j + "]: ");
                    field[i][j] = scanner.nextInt();
                }
            }

           
            int sum = 0;
            for (int[] row : field) {
                for (int element : row) {
                    sum += element;
                }
            }

            double average = (double) sum / (rows * columns);

            
            System.out.println("The sum = " + sum);
            System.out.println("The average = " + average);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
