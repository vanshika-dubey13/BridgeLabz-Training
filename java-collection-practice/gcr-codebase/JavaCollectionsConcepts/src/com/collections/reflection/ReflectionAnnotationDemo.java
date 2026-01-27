package com.collections.reflection;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Defining custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

// Applying annotation to a class
@Author(name = "Author Name")
class Book {
    // Class body
}

public class ReflectionAnnotationDemo {

	//main method
    public static void main(String[] args) {

        try {
            // Getting Class object
            Class<Book> cls = Book.class;

            // Retrieving annotation
            Author author = cls.getAnnotation(Author.class);

            // Displaying annotation value
            if (author != null) {
                System.out.println("Author Name: " + author.name());
            } else {
                System.out.println("Author annotation not found");
            }

        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

