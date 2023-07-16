package edu.algorithms.interpolationSearch;

public class InterpolationSearch {
    public static void main(String[] args) {
        int[] sequence = new int[] { -2, 0, 3, 5, 7, 9, 11, 15, 18, 21 };
        int element = 5;

        System.out.println(interpolationSearch(sequence, element));
    }

    public static int interpolationSearch(int[] sequence, int element) {
        int l = 0;
        int r = sequence.length - 1;
        while (sequence[l] < element && element < sequence[r]) {
            if (sequence[l] == sequence[r]) {
                break;
            }
            int index = (element - sequence[l]) * (l - r) / (sequence[l] - sequence[r]) + l;
            if (sequence[index] > element) {
                r = index - 1;
            } else if (sequence[index] < element) {
                l = index + 1;
            } else {
                return index;
            }
        }
        if (sequence[l] == element) {
            return l;
        }
        if (sequence[r] == element) {
            return r;
        }
        return -1;
    }
}
