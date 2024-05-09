package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileWriterTests {

    @Test
    public void testLettersAndNumbersFileWriter() throws IOException {
        String filePath = "resources/test.txt";
        String data = "Hello, World! 123";
        String expectedOutput = "Hello, World! 123";

        LettersAndNumbersFileWriter lettersAndNumbersFileWriter = new LettersAndNumbersFileWriter(filePath, data);
        lettersAndNumbersFileWriter.execute();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String actualOutput = bufferedReader.readLine();
        bufferedReader.close();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testOnlyLettersFileWriter() throws IOException {
        String filePath = "resources/test.txt";
        String data = "Hello, World! 123";
        String expectedOutput = "HelloWorld";

        OnlyLettersFileWriter onlyLettersFileWriter = new OnlyLettersFileWriter(filePath, data);
        onlyLettersFileWriter.execute();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String actualOutput = bufferedReader.readLine();
        bufferedReader.close();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testOnlyNumbersFileWriter() throws IOException {
        String filePath = "resources/test.txt";
        String data = "Hello, World! 123";
        String expectedOutput = "123";

        OnlyNumbersFileWriter onlyNumbersFileWriter = new OnlyNumbersFileWriter(filePath, data);
        onlyNumbersFileWriter.execute();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String actualOutput = bufferedReader.readLine();
        bufferedReader.close();

        assertEquals(expectedOutput, actualOutput);
    }
}
