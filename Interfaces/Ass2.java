import java.util.Random;


interface Average {
    float average();
}

interface Scholarship {
    float rate();
}

class Person {
    
    String p_name;

    public Person(String p_name) {
        this.p_name = p_name;
    }
}
class Employee extends Person implements Average {
    
    int no_salaries;
    int[] salary = new int[12];

   
    public Employee(String name, int n) {
        super(name);
        this.no_salaries = n;

       
        Random rand = new Random();
        for (int i = 0; i < 12; i++) {
            this.salary[i] = rand.nextInt(30001);
        }
    }

    @Override
    public float average() {
        if (no_salaries == 0) {
            return 0;
        }
        int sum = 0;
        for (int s : salary) {
            sum += s;
        }
        return (float) sum / no_salaries;
    }
}

class Student extends Person implements Average, Scholarship {
    
    int no_grades;
    Employee parent1;
    Employee parent2;
    int[] grade = new int[6];

    public Student(String name, int n, Employee r1, Employee r2) {
        super(name);
        this.no_grades = n;
        this.parent1 = r1;
        this.parent2 = r2;

        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            this.grade[i] = rand.nextInt(6) + 5;
        }
    }

    @Override
    public float average() {
        int sum = 0;
        for (int g : grade) {
            sum += g;
        }
        return (float) sum / grade.length;
    }

    @Override
    public float rate() {
        float gpa = average();
        float parentAverage = (parent1.average() + parent2.average()) / 2;
        return gpa * 6 + (60000 - parentAverage) * 4;
    }

    public static void main(String[] args) {
       
        Employee[] employees = new Employee[6];
        employees[0] = new Employee("Marjan", 12);
        employees[1] = new Employee("Elena", 12);
        employees[2] = new Employee("Petar", 0); 
        employees[3] = new Employee("Sonja", 12);
        employees[4] = new Employee("Dragan", 0); 
        employees[5] = new Employee("Nadezda", 12);

        Student[] students = new Student[3];
        students[0] = new Student("Student_1", 6, employees[0], employees[1]);
        students[1] = new Student("Student_2", 6, employees[2], employees[3]);
        students[2] = new Student("Student_3", 6, employees[4], employees[5]);

      
        for (Student student : students) {
            System.out.println("Name: " + student.p_name);
            System.out.println("GPA: " + student.average());
            System.out.println("parent 1: " + student.parent1.p_name + ", Average: " + student.parent1.average());
            System.out.println("parent 2: " + student.parent2.p_name + ", Average: " + student.parent2.average());
            System.out.println("Scholarship points: " + student.rate());
            System.out.println();
        }

        Student scholarshipRecipient = findScholarshipRecipient(students);
        System.out.println("The student who will receive the scholarship is: " + scholarshipRecipient.p_name);
    }

    
    private static Student findScholarshipRecipient(Student[] students) {
        Student recipient = students[0];
        float maxPoints = recipient.rate();

        for (int i = 1; i < students.length; i++) {
            float points = students[i].rate();
            if (points > maxPoints) {
                maxPoints = points;
                recipient = students[i];
            }
        }

        return recipient;
    }
}
