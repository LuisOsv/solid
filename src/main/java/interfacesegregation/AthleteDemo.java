package interfacesegregation;

public class AthleteDemo {

    public static void main(String[] args) {

        Triathlete triathlete = new Triathlete();
        triathlete.doBicycle();
        triathlete.run();
        triathlete.swim();
    }
}
