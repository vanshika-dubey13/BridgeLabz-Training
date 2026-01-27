package com.collections.annotations;

import java.util.ArrayList;

public class SuppressWarningsDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // Raw ArrayList (no generics)
        ArrayList list = new ArrayList();

        list.add("Hello");
        list.add(100);   // different types allowed

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
