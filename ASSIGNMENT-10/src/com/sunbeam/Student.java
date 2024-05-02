package com.sunbeam;

public class Student implements Comparable<Student>{
              int rollno;
              String name;
              double marks;
          
              public Student(int rollno,String name,double marks) {
            	  this.rollno=rollno;
            	  this.name=name;
            	  this.marks=marks;
              }
          @Override
          public String toString() {
        	  return "Student[rollno="+ rollno +",name=" +name +",marks="+marks+"]";
          }
             @Override
             public int compareTo(Student o) {
            	 return Double.compare(o.marks,this.marks);
             }
}
