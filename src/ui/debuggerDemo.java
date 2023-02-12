package ui;

import java.util.ArrayList;

import model.Student;
import model.StudentDirectory;

public class debuggerDemo {
    public static void main(String[] args) throws Exception {


        StudentDirectory sd = new StudentDirectory();
        sd.newStudent("John", "0011898");
        sd.newStudent("Alice", "232312");
        sd.newStudent("Bob", "2312312312");
        
        sd.printAllStudents();

    }
}
