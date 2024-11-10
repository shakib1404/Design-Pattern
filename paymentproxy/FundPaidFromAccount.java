package paymentproxy;
public class FundPaidFromAccount implements Payment {

    private double fundsAmount;

    public FundPaidFromAccount(double fundsAmount) {
        this.fundsAmount = fundsAmount;
    }

    @Override
    public void amount() {
        System.out.println("Processing payment of $" + fundsAmount + " from account.");
    }
}
