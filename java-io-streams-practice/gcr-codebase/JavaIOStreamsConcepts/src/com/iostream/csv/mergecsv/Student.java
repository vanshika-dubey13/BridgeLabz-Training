package com.iostream.csv.mergecsv;


public class Student {

	//attributes
	private int id;
    private String name;
    private int age;
    private int marks;
    private String grade;

    //constructor
    public Student(int id, String name, int age, int marks, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }
    
    //getter methods
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getMarks() { return marks; }
    public String getGrade() {return grade ;}


    //method to diplay student details
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age +
               ", marks=" + marks + ", grade='" + grade + "'}";
    }

}
