package assignments.studentdata;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentData {
    PriorityQueue<Student> data;

    public StudentData(){
        this.data = new PriorityQueue<>(Comparator.comparingInt(a -> a.rollNo));
    }

    public void addStudent(int rollNo, String name){
        Student student = new Student(rollNo, name);
        data.add(student);
    }

    public void printStudentData(){
        for(Student s : data){
            System.out.println(s.rollNo+" "+s.name);
        }
    }
}
