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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        // compare everything but createdAt
        if (getSubject() != null ? !getSubject().equals(that.getSubject()) : that.getSubject() != null) return false;
        if (getBody() != null ? !getBody().equals(that.getBody()) : that.getBody() != null) return false;
        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new EmailNotification(getSubject(), getBody(), getRecipient(), getSmtpProvider());
    }
}
