

	public class Test {
	    private String s;

	   
	    public Test(String s) {
	        this.s = s;
	    }

	   
	    public Test() {
	        this.s = "Programming languages";
	    }

	  
	    public void method1() {
	        System.out.println(s);
	    }

	    public void method2(int n) {
	        System.out.println(n);
	    }

	    
	    private void method3() {
	        System.out.println("Private method is invoked");
	    }

	    public static void main(String[] args) {
	      
	        Test testDefault = new Test();
	        
	        testDefault.method1();
	       
	        testDefault.method2(42);

	       
	        Test testWithParameter = new Test("Hello, World!");
	       
	        testWithParameter.method1();
	      
	        testWithParameter.method2(99);

	        
	    }
	}