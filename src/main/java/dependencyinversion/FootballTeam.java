package dependencyinversion;

import java.util.List;

public class FootballTeam {

    private List<FootballPlayer> players;

    public FootballTeam(List<FootballPlayer> playerList){
        this.players = playerList;
    }

    public void playFootball(){
        players.forEach(FootballPlayer::playSoccer);
    }
}
