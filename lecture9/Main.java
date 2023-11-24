import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
       
        Test testObject = new Test();

        Class<?> clazz = testObject.getClass();
        System.out.println("The name of class is " + clazz.getSimpleName());

       
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println("The name of constructor is " + constructors[0].getName());

        
        System.out.println("The public methods of class are:");
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
        }
    }
}
