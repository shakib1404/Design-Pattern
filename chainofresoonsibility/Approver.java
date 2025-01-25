package chainofresoonsibility;

abstract class Approver {
    protected Approver nextApprover; // Next handler in the chain

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void processRequest(PurchaseRequest request) {
        if (canApprove(request.getAmount())) {
            approve(request);
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        } else {
            System.out.println("No one can approve this purchase request for $" + request.getAmount());
        }
    }

    protected abstract boolean canApprove(double amount);
    protected abstract void approve(PurchaseRequest request);
}
