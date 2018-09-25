package dependencyinversion;

public class Midfielder implements FootballPlayer {
    @Override
    public void playSoccer() {
        maintainPossessionOfTheBall();
    }

    public void maintainPossessionOfTheBall() {
        System.out.println("Midfielder - Take the ball from defenders and feeding it to the strikers," +
                " as well as dispossessing opposing players");
    }
}
