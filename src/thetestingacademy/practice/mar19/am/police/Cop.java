package thetestingacademy.practice.mar19.am.police;

public class Cop {

    int gun;
    public Cop(int gun1){
        this.gun = gun1;
    }

    public int getShots(){
        return gun;
    }

    protected void canIShoot(){
        System.out.println("Yes You can");
    }

}
