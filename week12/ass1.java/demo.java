
import java.util.List;

import java.util.Random;

import java.util.stream.Collectors;



public class Demo {



    public static Student createStudent(String name, int indexNo) {

        Random random = new Random();

        int age = random.nextInt(13) + 18; 

        return new Student(name, indexNo, age);

    }



    public static void printValues(Student s) {

        System.out.println("Name: " + s.name);

        System.out.println("Index Number: " + s.indexNo);

        System.out.println("Age: " + s.age);

        System.out.println();

    }



    public static void main(String[] args) {

        List<String> names = List.of("Marija", "Ivan", "Sandra", "Emil", "Marko");



        List<Student> students = names.stream()

                .map(name -> createStudent(name, new Random().nextInt(10000) + 1))

                .collect(Collectors.toList());

        students.forEach(Demo::printValues);

    }

}
