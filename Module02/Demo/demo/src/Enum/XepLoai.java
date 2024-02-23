package Enum;

public enum XepLoai {
    gioi ("XL GIỎI"), //0
    kha ("XL KHÁ"), //1
    tb ("XL TB"), //2
    yeu ("XL YẾU"), //3
    duoihoc("ĐUỔI HỌC"); //4
    private String msg;
    XepLoai(String msg){
        this.msg= msg;
    }
    public  String des(){
        return this.msg;
    }

}
