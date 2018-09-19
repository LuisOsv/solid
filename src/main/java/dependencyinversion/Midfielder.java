package dependencyinversion;

public class Midfielder implements Player {
    @Override
    public void play() {
        maintainPossessionOfTheBall();
    }

    public void maintainPossessionOfTheBall() {
        System.out.println("Midfielder - Take the ball from defenders and feeding it to the strikers," +
                " as well as dispossessing opposing players");
    }
}
