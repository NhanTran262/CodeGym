package service;

public class SendYahoo implements ISend {
    public void send(String email){
        System.out.println("Send Yahoo" + email);
    }
}
