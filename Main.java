import java.util.ArrayList;

public class Main {
   
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        
        Student s1 = new Student(91.2, 84.9, 61.2, 0.0, 98.9, 100.0);
        Student s2 = new Student(41.7, 10.0, 100.0, 90.0, 42.8);
        Student s3 = new Student(80.2, 84.9, 89.6, 80.0, 78.9, 70.0, 85.0);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        int n = 2; // will be used later
    }
}
