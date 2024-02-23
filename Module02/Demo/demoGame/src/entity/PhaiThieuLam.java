package entity;

public class PhaiThieuLam {

    private static final PhaiThieuLam phaiThieuLam;

    static {
        phaiThieuLam = new PhaiThieuLam();
    }

    private PhaiThieuLam(){

    }

    public static PhaiThieuLam getInstance(){
        return phaiThieuLam;
    }
}
