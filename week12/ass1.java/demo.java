
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Demo {

	

	    public static void printValues(Student s) {

	        System.out.println("Name: " + s.getName());

	        System.out.println("IndexNo: " + s.getIndexNo());

	        System.out.println("Age: " + s.getAge());


	    }

	    public static Student createStudent(String name, int indexNo, int age) {

	        return new Student();

	            
	    }





		public static void main(String[] args) {

	        List<String> names = List.of("Marija", "Marko", "Ivan", "Sandra", "Simona");


	        Random random = new Random();

	        List<Student> students = names.stream()

	                .map(name -> createStudent(name, random.nextInt(10000), random.nextInt(13) + 18))

	                .collect(Collectors.toList());

	        students.forEach(Demo::printValues);

	    }

	}
	
