package edu.cores.anonim;

import java.lang.reflect.InvocationTargetException;

public class MainNewInstance {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("Cat");
        Comparable cmp2 = null;
        try {
            cmp2 = outerClass.cmp.getClass().getDeclaredConstructor(OuterClass.class).newInstance(outerClass);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException ex) {
            ex.printStackTrace();
        }
        System.out.println(outerClass.cmp);
        System.out.println(cmp2 == outerClass.cmp);
    }
}
