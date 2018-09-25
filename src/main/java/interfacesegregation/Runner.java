package interfacesegregation;

public interface Runner {
    default void run() {
        System.out.println("person is running");
    }
}
