package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String filePath = "resources/test.txt";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the string to be written to the file:");
            String inputData = scanner.nextLine();

            System.out.println("Choose an option:");
            System.out.println("1. Write only letters to the file");
            System.out.println("2. Write only numbers to the file");
            System.out.println("3. Write letters and numbers to the file");
            System.out.println("0. Exit");
            System.out.print("Enter the number of your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            switch (choice) {
                case 1:
                    System.out.println("Writing only letters to the file...");
                    new OnlyLettersFileWriter(filePath, inputData).execute();
                    break;
                case 2:
                    System.out.println("Writing only numbers to the file...");
                    new OnlyNumbersFileWriter(filePath, inputData).execute();
                    break;
                case 3:
                    System.out.println("Writing letters and numbers to the file...");
                    new LettersAndNumbersFileWriter(filePath, inputData).execute();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 4.");
            }
        }
    }
}
