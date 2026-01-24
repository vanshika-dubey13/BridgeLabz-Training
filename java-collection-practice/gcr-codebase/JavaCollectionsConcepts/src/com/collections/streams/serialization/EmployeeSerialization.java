package com.collections.streams.serialization;

import java.io.*;
import java.util.ArrayList;

public class EmployeeSerialization {
    public static void main(String[] args) {

        String fileName = "employees.dat";

        // Create employee list
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "HR", 50000));
        employees.add(new Employee(102, "Bob", "IT", 65000));
        employees.add(new Employee(103, "Charlie", "Finance", 60000));

        // Serialization
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
            e.printStackTrace();
        }

        // Deserialization 
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            ArrayList<Employee> retrievedEmployees =
                    (ArrayList<Employee>) ois.readObject();

            System.out.println("\nDeserialized Employee Data:");
            for (Employee emp : retrievedEmployees) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            System.out.println("Error during deserialization.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found.");
            e.printStackTrace();
        }
    }
}

