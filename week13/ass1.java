import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {

		       
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("What is your name? ");
		        String name = scanner.nextLine();

		        System.out.print("Which year were you born in? ");
		        int yearOfBirth = scanner.nextInt();

		        System.out.print("How tall <in meters> are you? ");
		        double height = scanner.nextDouble();

		        System.out.print("What is you weight <in kilograms>? ");
		        double weight = scanner.nextDouble();

		        
		        scanner.close();

		        
		        int currentYear = 2023; 
		        int age = currentYear - yearOfBirth;

		      
		        double bodyMassIndex = weight / (height * height);

		      
		        System.out.println("Your name is: " + name);
		        System.out.println("This year you'll turn " + age);
		        System.out.printf("Your body-mass index is: %.2f\n", bodyMassIndex);
		
	}

}
