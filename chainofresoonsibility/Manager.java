package chainofresoonsibility;

class Manager extends Approver {
    @Override
    protected boolean canApprove(double amount) {
        return amount <= 5000;
    }

    @Override
    protected void approve(PurchaseRequest request) {
        System.out.println("Manager approved the purchase request for $" + request.getAmount());
    }
}
