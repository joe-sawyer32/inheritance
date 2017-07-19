package com.theironyard;

public class Main {

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification("Company Policy", "This is a reminder of " +
                "some company policy", "@all_employees", "Hotmail");
        emailNotification.printText();
        emailNotification.transport();
        emailNotification.setStatus("Sent");
        emailNotification.showStatus();

        try {
            System.out.println("\nCreating a clone...");
            Object emailNotificationClone = emailNotification.clone();
            System.out.println("Clone is exact clone? " + emailNotificationClone.equals(emailNotification));
            System.out.println("Original Instance: " + emailNotification);
            System.out.println("Clone Instance: " + emailNotificationClone);
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }


        TextNotification myTextNotice = new TextNotification("Flash Flood Warning", "Davidson County is " +
                "under a flash flood warning until 5:00 PM", "@all615", "Verizon");

        myTextNotice.showStatus();
        myTextNotice.transport();
    }
}
