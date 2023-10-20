import java.lang.Math; 
public class Ass2 {

	public static void main(String[] args) {
		
		double decimalVariable = 3;
	       
        double sineValue = Math.sin(decimalVariable);
        double cosineValue = Math.cos(decimalVariable);
        double tangentValue = Math.tan(decimalVariable);
        double cotangentValue = 1 / tangentValue;
        double squareRootValue = Math.sqrt(decimalVariable);
        double squareValue = Math.pow(decimalVariable, 2);
        double cubeValue = Math.pow(decimalVariable, 3);
        double smallestLargerInteger = Math.ceil(decimalVariable);
        double largestSmallerInteger = Math.floor(decimalVariable);
        double circleRadius = decimalVariable;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        double piValue = Math.PI;
        double eValue = Math.E;

     
        System.out.println("Sine: " + sineValue);
        System.out.println("Cosine: " + cosineValue);
        System.out.println("Tangent: " + tangentValue);
        System.out.println("Cotangent: " + cotangentValue );
        System.out.println("Square Root: " + squareRootValue);
        System.out.println("Square: " + squareValue);
        System.out.println("Cube: " + cubeValue );
        System.out.println("Smallest Integer Larger or Equal: " + smallestLargerInteger);
        System.out.println("Largest Integer Smaller or Equal: " + largestSmallerInteger );
        System.out.println("Area of the Circle: " + circleArea );
        System.out.println("Value of Pi: " + piValue);
        System.out.println("Value of E: " + eValue);

	}

}

