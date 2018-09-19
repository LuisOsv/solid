package interfacesegregation;

public interface Cyclist {
    public default void doBicycle() {
        System.out.println("person is on a bike");
    }
}
