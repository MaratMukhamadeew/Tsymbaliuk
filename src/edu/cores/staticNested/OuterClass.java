package edu.cores.staticNested;

public class OuterClass {
    private String text;
    private static int number = 10;

    public OuterClass(String text) {
        super();
        this.text = text;
    }

    public class InnerClass {
        private int pages = 10;

        public int getPages() {
            return pages;
        }
    }

    public static class SuperNestedClass {
        private String author = "Bob";

        public String getAuthor() {
            return author;
        }
    }

    public static class NestedClass extends SuperNestedClass {
        private String word;

        public NestedClass(String word) {
            super();
            this.word = word;
        }

        public void printText() {
            System.out.println(word + " " + number);
        }

        public void printText(OuterClass oc) {
            System.out.println(word + " " + number + " " + oc.text + " " + super.getAuthor());
        }
    }

    public static class InnerStaticClass extends InnerClass {
        private String word;

        public InnerStaticClass(OuterClass oc, String word) {
            oc.super();
            this.word = word;
        }

        public void printText() {
            System.out.println(word + " " + number);
        }

        public void printText(OuterClass oc) {
            System.out.println(word + " " + number + " " + oc.text + " " + super.getPages());
        }
    }
}
