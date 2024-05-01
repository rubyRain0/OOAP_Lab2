package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class FileWriterTemplate {

    protected String filePath;
    protected String data;

    public FileWriterTemplate(String filePath, String data) {
        this.filePath = filePath;
        this.data = data;
    }

    public final void execute() {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            step1(bufferedWriter);
        } catch (IOException e) {
            System.err.println("Error occurred while opening the file: " + e.getMessage());
        } finally {
            step2(bufferedWriter);
        }
    }

    abstract void step1(BufferedWriter bufferedWriter) throws IOException;

    void step2(BufferedWriter bufferedWriter) {
        try {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        } catch (IOException e) {
            System.err.println("Error occurred while closing the file: " + e.getMessage());
        }
    }
}

