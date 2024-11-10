package bankerproxy;

public interface Banker {
    // Method to deposit a specified amount to an account
    void deposit(Long accountId, Long amount);

    // Method to withdraw a specified amount from an account
    Long withdraw(Long accountId, Long amount);
}

