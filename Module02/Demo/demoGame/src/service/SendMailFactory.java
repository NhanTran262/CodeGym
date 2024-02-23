package service;

import constant.Constants;

public class SendMailFactory {

    public static ISend createISend(int flag){
        switch (flag){
            case Constants.SEND_GMAIL: {
                return new SendGMail();
            }
            case Constants.SEND_YAHOO: {
                return new SendYahoo();
            }
            case Constants.SEND_OUTLOOK: {
                return new SendOutLook();
            }
            case Constants.SEND_FACEBOOK:{
                return new SendFacebook();
            }
            default:{
                return null;
            }
        }
    }
}
