package edu.cores.anonim;

import java.util.Arrays;
import java.util.Comparator;

public class MainComp {
    public static void main(String[] args) {
        String[] words = new String[] { "Hello", "Cat", "Home", "Student" };

        Comparator<String> cmp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Arrays.sort(words, cmp);
        System.out.println(cmp.getClass().getName());

        System.out.println(Arrays.toString(words));

        OuterClass outerClass = new OuterClass("Cat");
        System.out.println(outerClass.cmp.compareTo("Hello"));
        System.out.println(outerClass.cmp.getClass().getName());
    }
}
