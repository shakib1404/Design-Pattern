package bankerproxy;

public class BankerProxy implements Banker {
    
    // Reference to the real Banker implementation
    private final Banker banker;

    // Simulated user role (in a real application, this would come from a security context)
    private final String currentUserRole;

    public BankerProxy(String userRole) {
        this.banker = new BankerImpl(); // Initialize with the real Banker object
        this.currentUserRole = userRole; // Set the role of the current user
    }

    @Override
    public void deposit(Long accountId, Long amount) {
        // Allow deposit only if the user has "banker" role
        if ("banker".equals(currentUserRole)) {
            banker.deposit(accountId, amount);
        } else {
            throw new RuntimeException("Current user is not authorized to deposit");
        }
    }

    @Override
    public Long withdraw(Long accountId, Long amount) {
        // Proxy forwards the withdrawal request to the real Banker implementation
        return banker.withdraw(accountId, amount);
    }
}