
public class PaymentProcessor {

    public void processPayment(String paymentType) {
        switch (paymentType) {
            case "CreditCard":
                System.out.println("Processing credit card payment...");
                break;
            case "PayPal":
                System.out.println("Processing PayPal payment...");
                break;
            case "Bitcoin":
                System.out.println("Processing Bitcoin payment...");
                break;
            default:
                System.out.println("Invalid payment type.");
                break;
        }
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("CreditCard");
        processor.processPayment("Unknown");
    }
}


//Abstract Payment Method
interface PaymentMethod {
 void processPayment();
}

//Concrete Payment Types
class CreditCardPayment implements PaymentMethod {
 public void processPayment() {
     System.out.println("Processing credit card payment...");
 }
}

class PayPalPayment implements PaymentMethod {
 public void processPayment() {
     System.out.println("Processing PayPal payment...");
 }
}

class BitcoinPayment implements PaymentMethod {
 public void processPayment() {
     System.out.println("Processing Bitcoin payment...");
 }
}

//Null Object Implementation
class NullPayment implements PaymentMethod {
 public void processPayment() {
     System.out.println("Invalid payment type.");
 }
}

//Payment Factory
class PaymentFactory {
 public static PaymentMethod getPaymentMethod(String paymentType) {
     switch (paymentType) {
         case "CreditCard":
             return new CreditCardPayment();
         case "PayPal":
             return new PayPalPayment();
         case "Bitcoin":
             return new BitcoinPayment();
         default:
             return new NullPayment();
     }
 }
}

public class PaymentProcessor {
 public void processPayment(String paymentType) {
     PaymentMethod paymentMethod = PaymentFactory.getPaymentMethod(paymentType);
     paymentMethod.processPayment();
 }

 public static void main(String[] args) {
     PaymentProcessor processor = new PaymentProcessor();
     processor.processPayment("CreditCard");
     processor.processPayment("Unknown");
 }
}

