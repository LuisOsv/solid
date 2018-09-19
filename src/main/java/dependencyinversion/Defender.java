package dependencyinversion;

public class Defender implements Player {

    @Override
    public void play() {
        preventGoal();
    }

    public void preventGoal() {
        System.out.println("Defender - Provide support to the team and prevent the opposition from scoring a goal");
    }
}
