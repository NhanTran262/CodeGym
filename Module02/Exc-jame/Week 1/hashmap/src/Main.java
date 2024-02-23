import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Date> thuTuVaoLop = new HashMap<>();
        thuTuVaoLop.put("Kiet nho", new Date(2023,8,29,7,50));
        thuTuVaoLop.put("Kiet lon", new Date(2023,8,29,7,51));
        thuTuVaoLop.put("Quoc", new Date(2023,8,29,8,20));
        thuTuVaoLop.put("Phuc", new Date(2023,8,29,8,35));

        Set<String> keys = thuTuVaoLop.keySet();
        Map<String, Integer> danhSachDiTre = new HashMap<>();
        Date thoiGianVaoLop = new Date(2023,8,29,8,5);

        for (String key :keys){
            if (thuTuVaoLop.get(key).after(thoiGianVaoLop)){
                int delayTime = thuTuVaoLop.get(key).getMinutes() - thoiGianVaoLop.getMinutes();
                danhSachDiTre.put(key, 2000 * delayTime);
            }
        }
        System.out.println(danhSachDiTre);
    }
}