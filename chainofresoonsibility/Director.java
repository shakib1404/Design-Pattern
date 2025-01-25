package chainofresoonsibility;

class Director extends Approver {
    @Override
    protected boolean canApprove(double amount) {
        return amount > 5000; // Director handles any request above 5000
    }

    @Override
    protected void approve(PurchaseRequest request) {
        System.out.println("Director approved the purchase request for $" + request.getAmount());
    }
}