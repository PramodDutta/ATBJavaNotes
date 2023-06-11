package DL.demopractice.june11.police;

public  class Cop {

    int gun;

    public Cop(int gun){
        this.gun = gun;
    }

    public int getGun(){
        return gun;
    }

    protected void canIShoot(){
        System.out.println("Yes you can, You are a Police");
    }
}
