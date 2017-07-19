package com.theironyard;

import java.time.LocalDateTime;

/**
 * Created by Joe on 7/19/17.
 */
class Notification {
    // FIELDS
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    // CONSTRUCTORS
    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        this.status = "Waiting";
    }

    // METHODS
    // getters
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    // custom
    public void transport() {
        throw new NoTransportException();
    }

    public void showStatus() {
        System.out.println("Status: " + this.status);
    }

    protected void printText() {
        System.out.println("\nFrom Notification\n");
    }
}

class EmailNotification extends Notification {
    // FIELDS
    private String recipient;
    private String smtpProvider;

    // CONSTRUCTORS
    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }

    // METHODS
    // getters
    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    // setters
    public void setStatus(String status) {
        this.status = status;
    }

    // custom
    @Override
    public void transport() {
        System.out.println("Notification Subject: " + getSubject());
        System.out.println("Notification Body: " + getBody());
        System.out.println("Notification Creation: " + getCreatedAt());
        System.out.println("Notification Recipient: " + getRecipient());
        System.out.println("Notification SMTP Provider: " + getSmtpProvider());
    }

    @Override
    public void printText() {
        System.out.println("\nFrom EmailNotification\n");
    }
}

class TextNotification extends Notification {
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

class NoTransportException extends RuntimeException {

}
