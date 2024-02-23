import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //tìm kiếm tuyến tính
        Date  date1 = new Date();
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(40);
        lists.add(60);
        lists.add(100);
        lists.add(10);
        lists.add(5);
        lists.add(8);
        lists.add(11);
        lists.add(16);
        lists.add(3);
        for (int index = 0; index< lists.size(); index++){
            if (lists.get(index) == 10){
                System.out.println(index);
                break;
            }
            System.out.println(index);
        }
        Date date2 = new Date();
        long duration = date2.getTime() -date1.getTime();
        System.out.println(duration);
        //tìm kiếm nhị phân
    }
}