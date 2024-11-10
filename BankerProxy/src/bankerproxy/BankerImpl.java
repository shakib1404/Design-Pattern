package bankerproxy;

public class BankerImpl implements Banker {

    @Override
    public void deposit(Long accountId, Long amount) {
        System.out.printf("Depositing the amount %d to the account %d%n", amount, accountId);
    }

    @Override
    public Long withdraw(Long accountId, Long amount) {
        System.out.printf("Withdrawing the amount %d from the account %d%n", amount, accountId);
        return amount;
    }
}

