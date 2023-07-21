package edu.cores.inner;

public class InnerSubclass extends Outer.Inner {

    public InnerSubclass(Outer outer, String text) {
        outer.super(text);
    }
}
