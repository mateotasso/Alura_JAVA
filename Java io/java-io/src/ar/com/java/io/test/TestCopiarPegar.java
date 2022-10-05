package ar.com.java.io.test;

import java.io.*;
import java.net.Socket;

public class TestCopiarPegar {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream outputStream = new FileOutputStream("text-copia.txt");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String linea;

        while ((linea = bufferedReader.readLine()) != null) {
            bufferedWriter.write(linea);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            linea = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}
