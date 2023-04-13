package thetestingacademy.corejava.operators_03.misc_3;

public class Cast01 {
    public static void main(String[] args) {
        int course = 100;
        float GST = .1845f;
        int total = course + (int)(course*GST);
        System.out.println(total);


    }
}
