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

    // CONSTRUCTORS
    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
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

    // custom
    @Override
    public void transport() {
        System.out.println("Notification Subject: " + getSubject());
        System.out.println("Notification Body: " + getBody());
        System.out.println("Notification Creation: " + getCreatedAt());
        System.out.println("Notification Recipient: " + getRecipient());
        System.out.println("Notification SMTP Provider: " + getSmtpProvider());
    }
}

class TextNotification extends Notification {
    // FIELDS

    // CONSTRUCTORS

    // METHODS
}

class NoTransportException extends RuntimeException {

}
