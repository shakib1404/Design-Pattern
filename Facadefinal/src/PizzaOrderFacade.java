// PizzaOrderFacade.java
public class PizzaOrderFacade {
    private AccountChecker accountChecker;
    private SecurityChecker securityChecker;
    private Ledger ledger;
    private NotificationService notificationService;
    private Debit debit;
    private Credit credit;

    public PizzaOrderFacade() {
        this.accountChecker = new AccountChecker();
        this.securityChecker = new SecurityChecker();
        this.ledger = new Ledger();
        this.notificationService = new NotificationService();
        this.debit = new Debit();
        this.credit = new Credit();
    }

    public void orderPizza(double amount, String cardInfo, String securityPIN, String paymentType) {
        
        if (accountChecker.hasAccount(cardInfo)) {
            
            if (securityChecker.checkSecurityPIN(securityPIN)) {
                ledger.makeEntry(amount);
                
               
                if (paymentType.equalsIgnoreCase("debit")) {
                    debit.processDebitPayment(cardInfo, amount);
                } else if (paymentType.equalsIgnoreCase("credit")) {
                    credit.processCreditPayment(cardInfo, amount);
                } else {
                    System.out.println("Invalid payment type.");
                    return;
                }
                
                notificationService.sendNotification("Pizza ordered successfully for $" + amount);
                System.out.println("Order placed with card: " + cardInfo);
            } else {
                notificationService.sendNotification("Invalid security PIN.");
                System.out.println("Order failed: Invalid security PIN.");
            }
        } else {
            notificationService.sendNotification("No account found for the given card.");
            System.out.println("Order failed: No account found for the given card.");
        }
    }
}
