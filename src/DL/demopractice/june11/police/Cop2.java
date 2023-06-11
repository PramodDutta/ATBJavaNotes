package DL.demopractice.june11.police;

public class Cop2 {
    public static void main(String[] args) {

        Cop c1 = new Cop(99);
        int bullets = c1.getGun();
        System.out.println(bullets);


        c1.canIShoot();


    }
}
