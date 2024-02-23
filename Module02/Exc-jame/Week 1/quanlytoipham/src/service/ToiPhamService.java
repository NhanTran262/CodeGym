package service;

import entity.ToiPham;

public class ToiPhamService {
    private ToiPham[] toiphams;

    public ToiPhamService(){
        toiphams = new ToiPham[10];
    }

    public void themToiPham(ToiPham toiPham, int index){
//        ToiPham thang = new ToiPham();
//                thang.setName("thang");
//                thang.setAge(23);
//                thang.setSex("bd");
//                thang.setToidanh("undifine");
                toiphams[index] = toiPham;
    }
    public void InDanhSachToiPham() {
        for (int index =0;index <toiphams.length; index++){
            System.out.println(toiphams[index]);
        }

    }
}
