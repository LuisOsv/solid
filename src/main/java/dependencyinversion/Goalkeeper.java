package dependencyinversion;

public class Goalkeeper implements FootballPlayer {

    @Override
    public void playSoccer() {
        stopGoals();
    }

    public void stopGoals() {
        System.out.println("Goalkeeper - Stop the opposing team from scoring a goal");
    }
}
