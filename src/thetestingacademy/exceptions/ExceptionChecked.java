package thetestingacademy.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionChecked {

    public static void main(String[] args) {
        String path = "C://a.txt";
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
