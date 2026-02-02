package com.iostream.csv.convertcsvtojavaobject;


public class Student {

	private int id;
    private String name;
    private int age;
    private String department;

    //constructor
    public Student(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    //getter methods to get id, name, age and department
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + ", department='" + department + "'}";
    }

}
