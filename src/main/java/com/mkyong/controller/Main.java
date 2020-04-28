package com.mkyong.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Test");

        Map<Cat, String> cats = new HashMap<>();
       // cats.put(new Cat("Tor", 5), "Tor");
     //   cats.put(new Cat("Rot", 7), "Rot");


        Cat r1 = new Cat(20);
        Cat r2 = new Cat(3);
        Cat r3 = new Cat(10);
        Cat r4 = new Cat(4);
        cats.put(r1, "r1 - " + r1.age);
        cats.put(r2, "r2 - " + r2.age);
        cats.put(r3, "r3 - " + r3.age);
        cats.put(r4, "r4 - " + r4.age);

        System.out.printf(cats.toString());
    }

}


class Cat {

//    String name;
    int age;

    public Cat(int age) {
        this.age = age;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }
*/
    @Override
    public int hashCode() {
        return age;
    }





}

