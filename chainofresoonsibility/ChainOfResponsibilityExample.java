package chainofresoonsibility;

public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        // Create handlers
        Approver teamLeader = new TeamLeader();
        Approver manager = new Manager();
        Approver director = new Director();

        // Set the chain
        teamLeader.setNextApprover(manager);
        manager.setNextApprover(director);

        // Test the chain with different purchase amounts
        System.out.println("Processing purchase requests:\n");
        teamLeader.processRequest(new PurchaseRequest(300)); // Handled by Team Leader
        teamLeader.processRequest(new PurchaseRequest(1500)); // Handled by Manager
        teamLeader.processRequest(new PurchaseRequest(7500)); // Handled by Director
        teamLeader.processRequest(new PurchaseRequest(20000)); // Handled by Director
    }
}
