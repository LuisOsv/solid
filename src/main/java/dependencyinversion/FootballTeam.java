package dependencyinversion;

import java.util.List;

public class FootballTeam {

    private List<Player> playerList;

    public FootballTeam(List<Player> playerList){
        this.playerList = playerList;
    }

    public void playFootball(){
        playerList.forEach(
                player -> player.play()
        );
    }
}
