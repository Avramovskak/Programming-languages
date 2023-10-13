package exercise;

public class myNumber {
	
	private int num;
	public int num2;
	
	
	public myNumber(int num, int num2) {
		this.num = num;
		this.num2 = num2;
	}
	
	int getNum() {
		return num;
		
	}
	int getNum2() {
		return num2;
		
	}
	void setNum(int i) {
		num=i;
		num2=10*i;
	}
	
	void description() {
		System.out.println("Num: " + num);
		System.out.println("Num2:  " + num2);
	}
	
	float average() {
		return (num + num2) / 2;
		
	}
     
	public static void main(String[] ar) {
		myNumber A= new myNumber (13, 10);
		A.description();
		
		A.setNum(10);

		System.out.println("After setting num to 10: ");

		A.description();

		

		System.out.println("Value of num2 using getNum2: " + A.getNum2());



        System.out.println("Average of num and num2: " + A.average());



        myNumber mb = new myNumber(13, 10);

        System.out.println("Values of mo:");

        mb.description();

	}



}
		


