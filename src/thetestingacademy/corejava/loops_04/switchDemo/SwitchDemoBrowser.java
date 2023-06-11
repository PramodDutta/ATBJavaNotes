package thetestingacademy.corejava.loops_04.switchDemo;

import java.util.Locale;
import java.util.Scanner;

public class SwitchDemoBrowser {
    public static void main(String[] args) {
        // Scanner
        System.out.println("Enter your Browser!!");
        Scanner scanner = new Scanner(System.in);
        String browser;
        browser = scanner.next();
        // Chrome, cHROME, cHrOmE ->  chrome
        browser = browser.toLowerCase();


        switch (browser) {

            case "firefox":
                System.out.println("firefox started!!");
                break;
            case "chrome":
                System.out.println("chrome started!!");
                break;
            default:
                System.out.println("default started!!");
                break;
            case "edge":
                System.out.println("edge started!!");
                break;

        }
        System.out.println("End");

    }
}
