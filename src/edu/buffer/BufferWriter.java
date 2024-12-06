package edu.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter {
        public static void main(String[] args) throws Exception {
            FileWriter writer = new FileWriter("test.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("Hello");
            buffer.newLine();
            buffer.write("World");
            buffer.close();
            System.out.println("Success");
        }
}
