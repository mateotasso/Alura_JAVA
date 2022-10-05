package ar.com.java.io.test;

import java.io.*;

public class TestEscrituraFileWriter {
    public static void main(String[] args) throws IOException{

        FileWriter fileWriter = new FileWriter("text-file-writer.txt");
        fileWriter.write("Primera linea via Filewriter");
        fileWriter.write(System.lineSeparator());
        fileWriter.write("Segunda linea via file writer");
        fileWriter.close();
    }
}
