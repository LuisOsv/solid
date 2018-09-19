package interfacesegregation;

public interface Swimmer {
    public default void swim() {
        System.out.println("person is swimming");
    }
}
