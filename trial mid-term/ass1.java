
public class Ass1 {

	public static void main(String[] args) {
		System.out.println(args[0]);

		String operation = args[0].toUpperCase();
		double[] numbers = new double[5];

		for (int i = 1; i < args.length; i++) {
			try {
				numbers[i - 1] = Double.parseDouble(args[i]);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter valid numbers.");
				return;
			}
		}

		double result = 0;

		if (operation.equals("MIN")) {
			result = findMin(numbers);
		} else if (operation.equals("MAX")) {
			result = findMax(numbers);
		} else {
			System.out.println("Invalid operation. Please use 'MIN' or 'MAX'.");
			return;
		}

		System.out.println(result);
	}

	public static double findMin(double[] numbers) {
		double min = numbers[0];
		for (double num : numbers) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}

	public static double findMax(double[] numbers) {
		double max = numbers[0];
		for (double num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
}
