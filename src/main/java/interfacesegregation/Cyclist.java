package interfacesegregation;

public interface Cyclist {
    default void doBicycle() {
        System.out.println("person is on a bike");
    }
}
