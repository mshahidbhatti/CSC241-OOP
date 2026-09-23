package model;
public class Student{

    public String name = "Ali";

    private double gpa = 3.5;

    int semester = 3;      // package-private

    public void showData() {
        System.out.println(name);
        System.out.println(gpa);
        System.out.println(semester);
    }


}