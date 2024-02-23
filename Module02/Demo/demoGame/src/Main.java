import constant.Constants;
import entity.Account;
import entity.PhaiThieuLam;
import service.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("nhap loai mai ban muon gui");
        Scanner scanner= new Scanner(System.in);
        int mailTyepe= scanner.nextInt();
        scanner.nextLine();
        ISend iSend= null;

        switch (mailTyepe){
            case Constants.SEND_GMAIL:
                iSend = SendMailFactory.createISend(Constants.SEND_GMAIL);
                break;
            case Constants.SEND_YAHOO:
                iSend = SendMailFactory.createISend(Constants.SEND_YAHOO);
            case Constants.SEND_FACEBOOK:
                iSend= SendMailFactory.createISend(Constants.SEND_FACEBOOK);
        }

        AccountService accountService = new AccountService(iSend);
        accountService.addToList();
//        PhaiThieuLam thieuLam = PhaiThieuLam.getInstance();
//        System.out.println(thieuLam.hashCode());
//        PhaiThieuLam thieuLam2 = PhaiThieuLam.getInstance();
//        System.out.println(thieuLam2.hashCode());
    }
}