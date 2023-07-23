package edu.cores.localInnerClass;

import java.util.Comparator;

public class OuterClass {
    private boolean reverse;

    public OuterClass() {
    }

    public OuterClass(boolean reverse) {
        this.reverse = reverse;
    }

    public Comparator<String> getLengthComparator() {
        int n = 1;
        class StringLengthComparator implements Comparator<String> {
            @Override
            public int compare(String o1, String o2) {
                int direction = 1;
                if (OuterClass.this.reverse) {
                    direction = -1;
                }
                return (o1.length() - o2.length()) * n * direction;
            }
        }
        return new StringLengthComparator();
    }
}
