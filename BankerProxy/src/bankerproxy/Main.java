package bankerproxy;

public class Main {
    public static void main(String[] args) {
        // Create a proxy instance of Banker with the user role specified
        Banker bankerProxy = new BankerProxy("banker"); // Change role to test authorization

        // Example accountId and amounts
        Long accountId = 123456L;
        Long depositAmount = 5000L;
        Long withdrawAmount = 2000L;

        // Testing deposit functionality
        try {
            bankerProxy.deposit(accountId, depositAmount);
            System.out.println("Deposit successful.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Testing withdraw functionality
        Long withdrawnAmount = bankerProxy.withdraw(accountId, withdrawAmount);
        System.out.println("Withdrawn amount: " + withdrawnAmount);
    }
}


