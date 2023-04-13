package thetestingacademy.oops.inheritence.hasA.problem2;

public class Players {
    int id;
    String team;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Players{" +
                "id=" + id +
                ", team='" + team + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Players(int id, String team, String name) {
        this.id = id;
        this.team = team;
        this.name = name;
    }
}
