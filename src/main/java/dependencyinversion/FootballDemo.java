package dependencyinversion;

import java.util.ArrayList;
import java.util.List;

public class FootballDemo {

    public static void main(String[] args){

        List<FootballPlayer> footballPlayers = new ArrayList<>();
        footballPlayers.add(new Goalkeeper());
        footballPlayers.add(new Defender());
        footballPlayers.add(new Midfielder());
        footballPlayers.add(new Forward());
        FootballTeam footballTeam = new FootballTeam(footballPlayers);
        footballTeam.playFootball();
    }
}
