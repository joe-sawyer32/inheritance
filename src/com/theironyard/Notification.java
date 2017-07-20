package com.theironyard;

import java.time.LocalDateTime;

/**
 * Created by Joe on 7/19/17.
 */
public abstract class Notification {
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
//    public void transport() throws NoTransportException {
//
//    }
    public abstract void transport();

    public void showStatus() {
        System.out.println("Status: " + this.status);
    }

    protected void printText() {
        System.out.println("\nInherited from Notification\n");
    }
}

//class NoTransportException extends RuntimeException {
//
//}
