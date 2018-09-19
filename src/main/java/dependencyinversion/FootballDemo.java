package dependencyinversion;

import java.util.ArrayList;
import java.util.List;

public class FootballDemo {

    public static void main(String[] args){

        List<Player> players = new ArrayList<>();
        players.add(new Goalkeeper());
        players.add(new Defender());
        players.add(new Midfielder());
        players.add(new Forward());
        FootballTeam footballTeam = new FootballTeam(players);
        footballTeam.playFootball();
    }
}
