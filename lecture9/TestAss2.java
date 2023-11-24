import java.lang.reflect.Method;

public class Test {
    private String s;

    public Test(String s) {
        this.s = s;
    }
    public Test() {
        this.s = "Programming languages";
    }

    public void method1() {
        System.out.println("Printing the result of method 1: The value of the string is " + s);
    }
    public void method2(int n) {
        System.out.println("Printing the result of method 2: The number is " + n);
    }

    private void method3() {
        System.out.println("Printing the result of method 3: Private method invoked");
    }

    public static void main(String[] args) {
     
        Test testDefault = new Test();
       
        testDefault.method1();

        try {
            Method method3 = Test.class.getDeclaredMethod("method3");
            method3.setAccessible(true);
            method3.invoke(testDefault);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
