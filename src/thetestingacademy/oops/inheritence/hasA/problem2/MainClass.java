package thetestingacademy.oops.inheritence.hasA.problem2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

         Players players = new Players(1,"A","Pramod");
         Players players2 = new Players(2,"A","Dutta");
         Players players3 = new Players(3,"C","Lucky");

         List<Players> listA = new ArrayList<>();
         listA.add(players);
         listA.add(players2);

        List<Players> listB = new ArrayList<>();
        listB.add(players3);

         Team teamA = new Team(listA,"A");
         Team teamB = new Team(listA,"A");

         List<Team> teamList = new ArrayList<>();
         teamList.add(teamA);
         teamList.add(teamB);

         School school = new School(teamList,"ABC");
         school.getSchoolName();
         school.getTeamList();
    }
}
