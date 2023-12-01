package assignment;

public class Deserialization {

	public static void main(String[] args) {
		
		 StudentFileStream studentFileStream = new StudentFileStream();

	        Student deserializedStudent = studentFileStream.readFromFile("student.ser");	

	}

}
