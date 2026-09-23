package app;

import model.Student;

public class Demo {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.name);

        s.showData();
    }
}