package edu.cores.anonim;

import java.util.Comparator;

public class CompNewInstance {
    public static void main(String[] args) {
        Comparator<String> cmp1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Comparator cmp2 = null;
        try {
            cmp2 = cmp1.getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
        System.out.println(cmp2 == cmp1);
    }
}
