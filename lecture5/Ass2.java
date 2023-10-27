class egg {

	int category;
	public egg(int c) {
		this.category = c;

	}

	public void EGG() {
		System.out.println("Each egg has an albumen and a yolk");

	}

	public void print() {
		System.out.println("The egg is a nutritional product");

	}

}

class ostrich_egg extends egg {
	public ostrich_egg(int c) {
		Super(c);
		System.out.println("a constructor of ostrich_egg  that utilizes the constructor of egg");
	}

	public void EGG() {
		System.out.println("The albumen and yolk an OSTRICH egg are the largest");

	}

}


public class eggs {
	public static void main(String[] args) {
		egg henegg = new egg(2);
		ostrich_egg ostrichegg = new ostrich_egg(3);
		henegg.EGG();
		henegg.print();
		ostrichegg.EGG();

	}

}
