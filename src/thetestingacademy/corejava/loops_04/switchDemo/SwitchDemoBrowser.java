package thetestingacademy.corejava.loops_04.switchDemo;

import java.util.Locale;
import java.util.Scanner;

public class SwitchDemoBrowser {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        String browser;
        browser = scanner.next();
        browser = browser.toLowerCase(Locale.ROOT);


        switch (browser) {
            case "chrome":
                System.out.println("chrome started!!");
                break;
            case "firefox":
                System.out.println("firefox started!!");
                break;
            default:
                System.out.println("default started!!");
                break;

        }

    }
}
