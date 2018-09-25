package dependencyinversion;

public class Defender implements FootballPlayer {

    @Override
    public void playSoccer() {
        preventGoals();
    }

    public void preventGoals() {
        System.out.println("Defender - Provide support to the team and prevent the opposition from scoring a goal");
    }
}
