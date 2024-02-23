package service.impl;

import service.ISender;

public class SendGmail implements ISender {
    @Override
    public void send(String email) {
        System.out.println("Email: "+email);
    }
}
