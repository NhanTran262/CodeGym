package service;

public class SendFacebook implements ISend{
    @Override
    public void send(String email) {
        System.out.println("send facebook " +email );
    }
}
