package model;

public class Student {
    String name;
    String id;

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Student: " + name);
    }

}
