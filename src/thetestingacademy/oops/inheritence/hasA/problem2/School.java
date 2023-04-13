package thetestingacademy.oops.inheritence.hasA.problem2;

import java.util.List;

public class School {

    List<Team> teamList;
    String schoolName;

    int getTotalPlayers(){
        return 0;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "teamList=" + teamList +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public School(List<Team> teamList, String schoolName) {
        this.teamList = teamList;
        this.schoolName = schoolName;
    }
}
