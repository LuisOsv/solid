package interfacesegregation;

public interface Runner {
    public default void run() {
        System.out.println("person is running");
    }
}
