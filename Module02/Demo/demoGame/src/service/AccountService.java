package service;

import constant.Constants;
import entity.*;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private static List<Account> accountList;

    private ISend sendMail;

    public AccountService(ISend iSend)   {
        this.sendMail = iSend;
    }

    static {
        accountList = new ArrayList<>();
    }

    public Account createAccount(int flag){
        Account newAccount;
        switch (flag){
            case Constants.KIEM_THE: {
                //newAccount = new KiemTheAccount(1, "ThoBao", "BaoVanTho",100000, 30,"thieu lam", "Thieu Lam Dao");
                newAccount = new KiemTheAccount()
                        .id(1)
                        .name("ThoVanBao")
                        .password("BaoVanTHo");
                PhaiThieuLam phaiThieuLam = PhaiThieuLam.getInstance();
                newAccount = ((KiemTheAccount)newAccount)
                        .level(30)
                        .taiphu(100000)
                        .monphai(phaiThieuLam.toString())
                        .hephai("thieu lam dao");
                break;
            }
            case Constants.FIFA: {
                newAccount = new FifaAccount();
                break;
            }
            case Constants.LIEN_MINH: {
                newAccount = new LienMinhAccount();
                break;
            }
            default:{
                return null;
            }
        }
        return newAccount;

    }

    public void addToList(){
        Account account = createAccount(Constants.KIEM_THE);
        accountList.add(account);
        sendMail.send("Kiet Lon");
    }

}
