import java.util.Scanner;

public class konzola {

public static void main(String[] args) {

	Scanner scan = new Scanner(system.in);

	int input = scan.nextInt();

	System.out.println(input);

	System.out.println(Integer.toBinaryString(input));
	System.out.println(Integer.toOctalString(input));
	System.out.println(Integer.toHexString(input));
}
}
