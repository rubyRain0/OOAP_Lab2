package com.example;

import java.io.BufferedWriter;
import java.io.IOException;

public class OnlyLettersFileWriter extends FileWriterTemplate {

    public OnlyLettersFileWriter(String filePath, String data) {
        super(filePath, data);
    }

    @Override
    void step1(BufferedWriter bufferedWriter) throws IOException {
        StringBuilder outputData = new StringBuilder();
        for (char symbol : data.toCharArray()) {
            if (Character.isLetter(symbol)) {
                outputData.append(symbol);
            }
        }
        bufferedWriter.write(outputData.toString());
    }
}
