package thetestingacademy.corejava.staticDEMO;

public class Player {

    String name;
    public static int count;
    public static String gameName;

    public Player(String name) {
        this.name = name;
        count++;
        gameName = "Cricket";
    }

    public static String getName(){
//        String a = this.name;
        return gameName;
    }





}
