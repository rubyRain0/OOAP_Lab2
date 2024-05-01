package com.example;

import java.io.BufferedWriter;
import java.io.IOException;

public class LettersAndNumbersFileWriter extends FileWriterTemplate {

    public LettersAndNumbersFileWriter(String filePath, String data) {
        super(filePath, data);
    }

    @Override
    void step1(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.write(data);
    }
}
