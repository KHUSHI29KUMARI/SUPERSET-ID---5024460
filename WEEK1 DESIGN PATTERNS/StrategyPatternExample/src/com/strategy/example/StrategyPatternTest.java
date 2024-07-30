package com.strategy.example;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay with credit card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(150.0);

        // Pay with PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "password");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(75.0);
    }
}
