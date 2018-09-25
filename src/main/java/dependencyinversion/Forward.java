package dependencyinversion;

public class Forward implements FootballPlayer {
    @Override
    public void playSoccer() {
        scoreGoals();
    }

    public void scoreGoals() {
        System.out.println("Forward - Score goals and create scoring chances for other players");
    }
}
