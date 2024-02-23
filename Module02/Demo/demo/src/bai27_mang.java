public class bai27_mang {
    public static void main(String[] args) {
        // khai báo mảng
        String[] mangStr;
        Float[] mangfl;
        Double[] mangdb;

        // khởi tạo mảng kèm theo kích thước
        String[] mangStr2 = new String[12]; //chứa tối đa 12 phần tử
        int[] mangNguyen2 = new int[7];

        //khởi tạo mảng ke giá trị ban đầu
        String[] mangStr3 = new String[]{"a","b","c"};
        int[] mangNguyen3 = new int[]{1,2,3,4,5,6,7};

        //truy xuất phần tử của mảng
        System.out.println(mangNguyen3[2]);
        System.out.println(mangStr3[2]);

        //test
        System.out.println(mangStr2[0]);
        System.out.println(mangStr2[1]);

        //test 2
        mangStr = new String[]{"hello","byy"};
        System.out.println(mangStr2[0]);

//length
        System.out.println(mangNguyen3.length);

        //duyệt mảng dung for
        //c1: Dùng đề xuất các phần tử
        int[] mang4 = new int[]{1,2,3,4,5,6,7};
        for (int pt :mang4){
            System.out.println(pt);
        }

        String[] mang5 = new String[]{"a","b","c"};
        for (String pt :mang5){
            System.out.print(pt+"\t");
        }
        System.out.println("");
        System.out.println("");
        //c2: Dùng for duyệt qua index
        //lưu ý: index mảng từ 0 -> lengh -1
        System.out.println(mang4.length);
        for (int i=0; i<mang4.length; i++){
            //in ra vị trí index
            System.out.println(i);
            //in ra giá trị của mảng tại vị trí index i
            System.out.println(mang4[i]);
        }

        String[] mang6 = new String[]{"a","b","c"};
        for (int i=0; i<mang6.length; i++) {

            System.out.println(mang6[i]);
        }

        //c1: Gọi trực tiếp theo index để gán giá trị mới
        mang6[0] = "obama";
        //duyệt mảng
        System.out.println("mảng sau khi đổi");
        for (int i=0;i<mang6.length; i++){
            System.out.println(mang6[i]);
        }

        //update toàn bộ danh sách
        int[] mang7 = new int[]{1,2,3,4,5,6,7};
        for(int i=0; i<mang7.length; i++){
            mang7[i] = mang7[i] +5; // mang7[i]+=5;
        }

        //duyệt mảng 7
        System.out.println("mảng sau khi thay đổi");
        for (int i=0;i<mang7.length;i++){
            System.out.println(mang7[i]);
        }
    }
}
