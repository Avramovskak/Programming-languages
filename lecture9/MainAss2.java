
import java.lang.reflect.Field;

import java.lang.reflect.Method;



public class Main {

    public static void main(String[] args) {

      

        Test testObject = new Test();



    

        invokeMethod1(testObject);



        

        try {

            printFieldValue(testObject);

        } catch (IllegalAccessException e) {

            System.out.println("Exception caught: " + e.getMessage());

        }



       

        enableAccessAndPrintFieldValue(testObject);




        changeFieldValue(testObject, "JAVA");



       

        enableAccessAndPrintFieldValue(testObject);



    

        enableAccessAndInvokeMethod3(testObject);

    }



    private static void invokeMethod1(Test testObject) {

        try {

            Method method1 = Test.class.getDeclaredMethod("method1");

            method1.setAccessible(true);

            method1.invoke(testObject);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }



    private static void printFieldValue(Test testObject) throws IllegalAccessException {

        Field fieldS;

        try {

            fieldS = Test.class.getDeclaredField("s");

            System.out.println("Value of field s: " + fieldS.get(testObject));

        } catch (NoSuchFieldException e) {

            e.printStackTrace();

        }

    }



    private static void enableAccessAndPrintFieldValue(Test testObject) {

        try {

            Field fieldS = Test.class.getDeclaredField("s");

            fieldS.setAccessible(true);

            System.out.println("Value of field s: " + fieldS.get(testObject));

        } catch (Exception e) {

            e.printStackTrace();

        }

    }



    private static void changeFieldValue(Test testObject, String newValue) {

        try {

            Field fieldS = Test.class.getDeclaredField("s");

            fieldS.setAccessible(true);

            fieldS.set(testObject, newValue);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }



    private static void enableAccessAndInvokeMethod3(Test testObject) {

        try {

            Method method3 = Test.class.getDeclaredMethod("method3");

            method3.setAccessible(true);

            method3.invoke(testObject);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
