package thetestingacademy.corejava.staticDEMO;

public class PlayerRunner {

    public static void main(String[] args) {

        Player player = new Player("Pramod");
        Player player1 = new Player("Pramod");
        Player player2 = new Player("Pramod");
        Player player4 = new Player("Pramod");
        Player player3 = new Player("Pramod");
        System.out.println(Player.count);
        System.out.println(Player.getName());


    }
}
