package edu.cores.immutable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(new int[] { 1, 2, 3 });
        System.out.println(point);

        int[] coord = point.getCoord();
        coord[0] = 8;
        System.out.println(Arrays.toString(coord));

        System.out.println(point);
    }
}
