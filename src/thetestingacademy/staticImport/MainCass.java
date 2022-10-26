package thetestingacademy.staticImport;
import static thetestingacademy.staticImport.StaticDemo.*;
public class MainCass {

    public static void main(String[] args) {
        // No need to Use class name to call static members
        System.out.println(name);
        printName();
    }
}
