package assignments.studentdata;

public class Main {
    public static void main(String[] args) {
        StudentData studentData = new StudentData();

        studentData.addStudent(101, "kaif");
        studentData.addStudent(102, "amit");
        studentData.addStudent(105, "omesh");
        studentData.addStudent(104, "jaydeep");
        studentData.addStudent(103, "aditya");

        while (!studentData.data.isEmpty()){
            Student s = studentData.data.remove();
            System.out.println(s.rollNo+" "+s.name);
        }
    }
}
