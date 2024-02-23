package service;

public class SendOutLook implements ISend {

    @Override
    public void send(String email) {
        System.out.println("OutLook send Mail");
    }
}
