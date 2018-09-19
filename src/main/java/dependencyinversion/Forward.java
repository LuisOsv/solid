package dependencyinversion;

public class Forward implements Player {
    @Override
    public void play() {
        scoreGoals();
    }

    public void scoreGoals() {
        System.out.println("Forward - Score goals and create scoring chances for other players");
    }
}
