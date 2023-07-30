package edu.cores.immutable;

import java.util.Arrays;

public final class ImmutablePoint {
    private final int[] coord;

    public ImmutablePoint(int[] coord) {
        this.coord = new int[coord.length];
        System.arraycopy(coord, 0, this.coord, 0, coord.length);
    }

    public ImmutablePoint() {
        this.coord = new int[2];
    }

    public int[] getCoord() {
        int[] tempCoord = new int[coord.length];
        System.arraycopy(this.coord, 0, tempCoord, 0, coord.length);
        return tempCoord;
    }

    @Override
    public String toString() {
        return "ImmutablePoint [coord = " + Arrays.toString(coord) + "]";
    }
}
