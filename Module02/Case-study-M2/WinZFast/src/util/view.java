package util;

import service.impl.LoginService;

import java.io.Serializable;

import static service.impl.LoginService.menuLogin;


public class view implements Serializable {
    public static void run() {
       LoginService.menuLogin();
    }
}
