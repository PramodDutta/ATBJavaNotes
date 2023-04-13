package thetestingacademy.corejava.staticDEMO;

public class PlayerRunner {

    public static void main(String[] args) {

        Player player = new Player("Pramod");
        System.out.println(player.name);
        System.out.println(Player.count);

        // Black Board
        // Class count, Name, name - Object
        // count = 2 , Game - Cricket



        // Object - lUCKY
        // s1 - new Player("Lucky"); // Name -> Lucky,age = 34
        // s2- new Player("YoYO"); // Name -> YOYO,age = 32



        Player player1 = new Player("Patil");
        System.out.println(player1.name);
        System.out.println(Player.count);





        Player player2 = new Player("Pramod");
        Player player4 = new Player("Pramod");
        Player player3 = new Player("Pramod");


        System.out.println(Player.count);
        System.out.println(Player.getName());






    }
}
