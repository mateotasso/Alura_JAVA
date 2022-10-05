package ar.com.java.io.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class TestUnicodeEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String letra = "A";
        System.out.println(letra.codePointAt(0));

        //Charset charset = Charset.defaultCharset();
        Charset charset = Charset.forName("windows-1252");
        System.out.println(charset.displayName());

        byte[] bytes = letra.getBytes("UTF-16");
        System.out.println("Cantidad de bytes: " + bytes.length);
    }
}
