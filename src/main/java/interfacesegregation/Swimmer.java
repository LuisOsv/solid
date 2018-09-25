package interfacesegregation;

public interface Swimmer {
    default void swim() {
        System.out.println("person is swimming");
    }
}
