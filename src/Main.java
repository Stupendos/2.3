//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final Bicycle q1 = new Bicycle("q1", 2);
        final Car q2 = new Car("q2", 4);
        final Truck q3 = new Truck("q3", 8);
        q1.check();
        q2.check();
        q3.check();
        final Checkable[]wheeledTransports = {q1, q2, q3};
        for (Checkable wheeledTransport : wheeledTransports) {
            wheeledTransport.check();
        }
    }
}