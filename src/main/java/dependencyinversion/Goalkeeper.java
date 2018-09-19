package dependencyinversion;

public class Goalkeeper implements Player {

    @Override
    public void play() {
        stopGoal();
    }

    public void stopGoal() {
        System.out.println("Goalkeeper - Stop the opposing team from scoring a goal");
    }
}
