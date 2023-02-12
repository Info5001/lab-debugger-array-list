package model;

import java.util.ArrayList;

public class StudentDirectory {
    ArrayList<Student> studentList;

    public StudentDirectory(){
        studentList = new ArrayList<Student>();
    }

    public Student newStudent(String name, String id){
        Student ns = new Student(name, id);
        studentList.add(ns);
        return ns;
    }

    public void printAllStudents(){
        System.out.println("List of all students. total " + studentList.size());
        for (Student eachStudent : studentList) {
            eachStudent.print();
        }
    }


}
