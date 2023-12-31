package edu.cores.anonim;

public class OuterClass {
    private String text;

    public Comparable<String> cmp = new Comparable<String>() {
        public int direction;
        {
            direction = 1;
        }
        @Override
        public int compareTo(String o) {
            return (OuterClass.this.text.length() - o.length()) * direction;
        }
    };

    public OuterClass(String text) {
        this.text = text;
    }

    public int compareLength(String  text) {
//        int temp = cmp.direction;
        return cmp.compareTo(text);
    }
}
