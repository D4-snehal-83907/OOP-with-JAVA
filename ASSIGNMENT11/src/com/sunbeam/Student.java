package com.sunbeam;
import java.util.*;

public class Student implements Comparable<Student> {
    int rollno;
    String name;
    int marks;
    String course;
     
    public Student()
    {
    	
    }    
        public Student(int rollno, String name, int marks, String course) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.course = course;
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rollno, o.rollno);
    }

    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name + ", Marks: " + marks + ", Course: " + course;
    }
}

