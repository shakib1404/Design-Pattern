package paymentproxy;

public class Main {
    public static void main(String[] args) {
        // Trying with permission
        Payment paymentWithPermission = new CheckProxy(1000.0, true);
        paymentWithPermission.amount();

        System.out.println();

        // Trying without permission
        Payment paymentWithoutPermission = new CheckProxy(1000.0, false);
        paymentWithoutPermission.amount();
    }
}