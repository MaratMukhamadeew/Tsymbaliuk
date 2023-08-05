package edu.cores.functionalInterface.sample9a;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Saver<String> sr = Main::saveToFile;
        try {
            sr.saveTo("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> void saveToFile(T element) throws IOException {
        PrintWriter pw = new PrintWriter(new File("save.txt"));
        pw.println(element);
    }
}
