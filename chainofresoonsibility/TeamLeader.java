package chainofresoonsibility;
class TeamLeader extends Approver {
    @Override
    protected boolean canApprove(double amount) {
        return amount <= 500;
    }

    @Override
    protected void approve(PurchaseRequest request) {
        System.out.println("Team Leader approved the purchase request for $" + request.getAmount());
    }
}
