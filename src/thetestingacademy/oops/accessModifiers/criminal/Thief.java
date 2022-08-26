package thetestingacademy.oops.accessModifiers.criminal;

import thetestingacademy.oops.accessModifiers.police.Cop;

public class Thief {

    public static void main(String[] args) {
        Cop cop = new Cop(100);
        int gunValue = cop.getGuns();
        System.out.println(gunValue);

        // cop.canIShoot();


    }
}
