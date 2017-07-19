package com.theironyard;

/**
 * Created by Joe on 7/19/17.
 */
public class EmailNotification extends Notification {
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
        System.out.println("\nOverridden in EmailNotification\n");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new EmailNotification(getSubject(), getBody(), getRecipient(), getSmtpProvider());
    }
}
