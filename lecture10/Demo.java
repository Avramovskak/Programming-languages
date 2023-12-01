package assignment;

public class Demo {

    public static void main(String[] args) {
        Student student = new Student("Kristina","075498657",1005,7777);
        StudentFileStream fileStream = new StudentFileStream();
        String fileName = "student.txt";
        fileStream.writeToFile(student, fileName);
        
        
        
    }

}
