package com.theironyard;

/**
 * Created by Joe on 7/19/17.
 */
public class TextNotification extends Notification {
    // FIELDS
    private String recipient;
    private String smsProvider;

    // CONSTRUCTORS
    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        printText();
    }

    // METHODS
    // getters
    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    // custom
    @Override
    public void transport() {
        System.out.println("Notification Subject: " + getSubject());
        System.out.println("Notification Body: " + getBody());
        System.out.println("Notification Creation: " + getCreatedAt());
        System.out.println("Notification Recipient: " + getRecipient());
        System.out.println("Notification SMS Provider: " + getSmsProvider());
    }
}
