package service;

public class SendGMail implements ISend {
    public void send(String email){
        System.out.println("send mail to "+ email);
    }

}
