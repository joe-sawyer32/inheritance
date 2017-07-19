package com.theironyard;

public class Main {

    public static void main(String[] args) {
        EmailNotification myEmailNotice = new EmailNotification("Company Policy", "This is a reminder of " +
                "some company policy", "@all_employees", "Hotmail");
        myEmailNotice.printText();
        myEmailNotice.transport();
        myEmailNotice.setStatus("Sent");
        myEmailNotice.showStatus();

        TextNotification myTextNotice = new TextNotification("Flash Flood Warning", "Davidson County is " +
                "under a flash flood warning until 5:00 PM", "@all615", "Verizon");

        myTextNotice.showStatus();
        myTextNotice.transport();
    }
}
