package thetestingacademy.oops.inheritence.hasA.problem2;

import thetestingacademy.corejava.staticDEMO.Player;

import java.util.List;

public class Team {
    List<Players> players;
    String name;

    List<Player> getPlayersList(){
        return null;
    }

    public List<Players> getPlayers() {
        return players;
    }

    public void setPlayers(List<Players> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + players +
                ", name='" + name + '\'' +
                '}';
    }

    public Team(List<Players> players, String name) {
        this.players = players;
        this.name = name;
    }
}
