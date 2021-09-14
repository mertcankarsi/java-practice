package com.mckarsi.javapractice.designpatterns.creational.singleton;

public class MailService {

    private static final MailService instance = new MailService();

    // hide constructor to prevent generating a new instance
    private MailService() {
        System.out.println("Mail service constructor called.");
    }

    public static MailService getInstance() {
        return instance;
    }

    public void sendMail(String email) {
        System.out.printf("Mail sent to %s\n", email);
    }
}
