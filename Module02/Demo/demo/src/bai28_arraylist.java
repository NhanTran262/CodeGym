import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bai28_arraylist {
    public static void main(String[] args) {
        //1.Khai báo list
        ArrayList<Integer> lst = new ArrayList<>();
        //2.Khai báo với số lượng pt ban đầu
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        //3.Khởi tạo list với các phần tử ban đầu
        ArrayList<Integer> lst3 =new ArrayList<>(List.of(1,2,3,4,5,6));

        //Xuất List
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);

        //Phương thức add
        ArrayList<Integer> lst4 = new ArrayList<>();
        lst4.add(7);
        lst4.add(8);
        lst4.add(11);
        System.out.println("lst4 mới add là: ");
        System.out.println(lst4);
        //add(index,element) vào vị trí chỉ định
        lst4.add(1,99);
        System.out.println("lst4 mới add 99 là: ");
        System.out.println(lst4);
        //size
        System.out.println("số pt của lst4 là: "+lst4.size());
        //get (int index): trả về giá trị lít tại vị trí chỉ định
        System.out.println(lst4.get(3));
        //remove (index)
        lst4.remove(2);
        System.out.println("lst4 sau xóa giá trị tại vị trí index 2 là: ");
        System.out.println(lst4);
        //remove (1 phần tử được chỉ định)
        ArrayList<Integer> lst5 =new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst5 = " +lst5);
        lst5.remove(Integer.valueOf(3));
        System.out.println("lst5 sau xóa = "+lst5);
//set (index,element) : thay đổi thông tin
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst6= "+lst6);
        lst6.set(2,99);
        System.out.println("lst6 sau khi sửa: "+lst6);
        //contains() Kiểm tra Collection có chứa phần tử nào đó hay không
        ArrayList<Integer> lst7 =new ArrayList<>(List.of(1,2,3,4,5,6));
        boolean kiemtra = lst7.contains(10);
        System.out.println(kiemtra);
        //Collections.sort(list) : sắp xếp tăng dần
        ArrayList<Integer> lst8 = new ArrayList<>(List.of(19,2,30,4,5,6));
        Collections.sort(lst8);
        System.out.println("List sau sx là: "+lst8);
        //indexOf() : Tìm vị trí đầu tiên trong element của list
        //nếu không tồn tại thì trả về -1
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(19,2,30,4,5,6,4));
        System.out.println(lst9.indexOf(4));
        //Duyệt list
        //cách 1
        ArrayList<Integer> lst10 = new ArrayList<>(List.of(19,2,30,7,3,5));
        System.out.println("lst10 dùng duyệt for: ");
        for (int value : lst10){
            System.out.println(value);
        }
        System.out.println("------------------");
        //cách 2: khi cần dùn đến các chỉ số index
        ArrayList<Integer> lst11 = new ArrayList<>(List.of(19,2,30,7,3,5));
        for (int index=0; index<lst11.size(); index++){
            int value = lst11.get(index);
            System.out.println(value);
        }
    }
}
