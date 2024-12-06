package edu.filehandelling;

import java.io.FileWriter;

public class WriteInFile {

        public static void main(String[] args) {
            try {
                FileWriter myWriter = new FileWriter("ashok.txt");
                myWriter.write("My Name is Ashok");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (Exception e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

}
