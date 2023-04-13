package thetestingacademy.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex015 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:/a.txt";
        FileInputStream f = new FileInputStream(path);
        // throw - Explicity to tell the Exception is there.
    }
}
