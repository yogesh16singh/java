interface PaymentStrategy{
    void processPayment();
}
class CreditCardPayment implements PaymentStrategy {
  public void processPayment() {
    System.out.println("Processing credit card payment...");
  }
}

// Concrete strategy for PayPal payment
 class PayPalPayment implements PaymentStrategy {
  public void processPayment() {
    System.out.println("Processing PayPal payment...");
  }
}

// Concrete strategy for crypto payment
 class CryptoPayment implements PaymentStrategy {
  public void processPayment() {
    System.out.println("Processing crypto payment...");
  }
}

// Concrete strategy for Stripe payment
 class StripePayment implements PaymentStrategy {
  public void processPayment() {
    System.out.println("Processing Stripe payment...");
  }
}

 class PaymentProcessor {
  private PaymentStrategy paymentStrategy; // Reference to a payment strategy
  // Constructor to set the payment strategy
  public PaymentProcessor(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  // Process payment using the current strategy
  public void processPayment() {
    paymentStrategy
        .processPayment(); // Delegate the payment processing to the strategy
  }

  // Dynamically change payment strategy at runtime
  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }
}

public class Main {
  public static void main(String[] args) {
    // Create strategy instances for each payment type
    PaymentStrategy creditCard = new CreditCardPayment();
    PaymentStrategy payPal = new PayPalPayment();
    PaymentStrategy crypto = new CryptoPayment();
    PaymentStrategy stripe = new StripePayment();
    // Use the Strategy Pattern to process payments
    PaymentProcessor processor =
        new PaymentProcessor(creditCard); // Initially using CreditCardPayment
    processor.processPayment(); // Processing credit card payment...
    // Dynamically change the payment strategy to PayPal
    processor.setPaymentStrategy(payPal);
    processor.processPayment(); // Processing PayPal payment...
    // Switch to Crypto
    processor.setPaymentStrategy(crypto);
    processor.processPayment(); // Processing crypto payment...
    // Switch to Stripe
    processor.setPaymentStrategy(stripe);
    processor.processPayment(); // Processing Stripe payment...
  }
}
