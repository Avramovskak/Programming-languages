interface Two_D_Shape {
	float PI = 3.14f;

	void parameters();

	float area();

	float perimeter();

}

interface Three_D_Shape {

	float volume();

}

class Sphere implements Two_D_Shape, Three_D_Shape {

	private float radius;

	// Constructor
	public Sphere(float radius) {
		this.radius = radius;
		System.out.println("A new sphere has been created");
	}

	@Override
	public void parameters() {
		System.out.println("Sphere parameters: radius = " + radius);
	}

	@Override
	public float area() {
		return 4 * PI * radius * radius;
	}

	@Override
	public float perimeter() {

		return 0;
	}

	@Override
	public float volume() {
		return (4 / 3) * PI * radius * radius * radius;
	}
}

public class Triangle implements Two_D_Shape {

	private float sideA, sideB, sideC, height;

	public Triangle(float sideA, float sideB, float sideC, float height) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.height = height;
		System.out.println("A new triangle is created ");
	}

	public boolean rectangular() {
		return (sideA * sideA + sideB * sideB == sideC * sideC);

	}

	@Override
	public void parameters() {
		System.out.println("Triangle parameters: sideA = " + sideA + ", sideB = " + sideB + ", sideC = " + sideC
				+ ", height = " + height);

	}

	@Override
	public float area() {
		return 0.5f * sideA * height;

	}

	@Override
	public float perimeter() {
		return sideA + sideB + sideC;

	}

	public static void main(String[] args) {
		
		Triangle T1 = new Triangle(3, 5, 6, 3);
		Sphere B1 = new Sphere(4);
		Two_D_Shape T2 = new Triangle(8, 2, 10, 16);
		Two_D_Shape B2 = new Sphere(3);
		Three_D_Shape B3 = new Sphere(7);

		T1.parameters();
		System.out.println("Triangle area: " + T1.area());
		System.out.println("Triangle perimeter: " + T1.perimeter());
		System.out.println("Is the triangle rectangular? " + T1.rectangular());

		B1.parameters();
		System.out.println("Sphere area: " + B1.area());
		System.out.println("Sphere volume: " + B1.volume());

		T2.parameters();
		System.out.println("Triangle area: " + T2.area());
		System.out.println("Triangle perimeter: " + T2.perimeter());

		((Two_D_Shape) B2).parameters();
		System.out.println("Sphere area: " + ((Two_D_Shape) B2).area());

		((Three_D_Shape) B3).volume();
	}
}
