package service;

import entity.QuanLy;

public class QuanLyService {
    public void traluong() {
        int luong = 10000000;
        QuanLy thang = new QuanLy(5000000);
        long currentTien = thang.getVitien();
        thang.setVitien(currentTien + luong);
        System.out.println(thang.getVitien());


    }
}
