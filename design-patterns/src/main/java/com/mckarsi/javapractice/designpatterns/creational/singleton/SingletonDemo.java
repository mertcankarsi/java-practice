package com.mckarsi.javapractice.designpatterns.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        MailService.getInstance().sendMail("karsi.mertcan@gmail.com");
        MailService.getInstance().sendMail("foo.bar@gmail.com");
    }
}
