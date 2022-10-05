package ar.com.java.io.test;

import java.io.*;

public class TestLectura {
    public static void main(String[] args) throws IOException {

        // obtengo el archivo
        InputStream fileInputStream = new FileInputStream("text-generado.txt");
        // proceso el archivo
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        // leer el archivo
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linea;
//        System.out.println(linea);

        while ((linea = bufferedReader.readLine()) != null) {
            System.out.println(linea);
        }
    }
}
