package edu.cores.privateMethodsInterfaceses.sample1;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public interface Logger {
    default void writeErrorMessage(String message) throws IOException {
        message += message;
        File file = new File("Errors.CSV");
        writeToCSVFile(file, message);
    }

    default void writeWarningMessage(String message) throws IOException {
        message += message;
        File file = new File("Warnings.CSV");
        writeToCSVFile(file, message);
    }

    private void writeToCSVFile(File file, String message) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
            pw.print(message + ";");
        } catch (IOException e) {
            throw e;
        }
    }
}
