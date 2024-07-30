package com.decorator.example;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create an EmailNotifier
        Notifier notifier = new EmailNotifier();

        // Decorate the notifier with SMSNotifierDecorator
        notifier = new SMSNotifierDecorator(notifier);

        // Decorate the notifier with SlackNotifierDecorator
        notifier = new SlackNotifierDecorator(notifier);

        // Send notification
        notifier.send("Your order has been shipped!");
    }
}
