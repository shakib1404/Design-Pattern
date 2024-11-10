package paymentproxy;

public class CheckProxy implements Payment {

    private FundPaidFromAccount realPayment;
    private boolean hasPermission;

    public CheckProxy(double fundsAmount, boolean hasPermission) {
        this.realPayment = new FundPaidFromAccount(fundsAmount);
        this.hasPermission = hasPermission;
    }

    @Override
    public void amount() {
        if (hasPermission) {
            System.out.println("Permission granted. Initiating payment...");
            realPayment.amount();
        } else {
            System.out.println("Permission denied. You are not authorized to make this payment.");
        }
    }
}
