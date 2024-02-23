package entity;


public class KiemTheAccount extends Account {
    private long level;

    private long taiPhu;

    private String monPhai;

    private String hePhai;


    public KiemTheAccount() {
    }

    public KiemTheAccount(long level, long taiPhu, String monPhai, String hePhai) {
        this.level = level;
        this.taiPhu = taiPhu;
        this.monPhai = monPhai;
        this.hePhai = hePhai;
    }

    public KiemTheAccount(long id, String username, String password, long level, long taiPhu, String monPhai, String hePhai) {
        super(id, username, password);
        this.level = level;
        this.taiPhu = taiPhu;
        this.monPhai = monPhai;
        this.hePhai = hePhai;
    }

    public KiemTheAccount level(int level) {
        this.level = level;
        return this;
    }

    public KiemTheAccount taiphu(int taiphu) {
        this.taiPhu = taiphu;
        return this;
    }

    public KiemTheAccount monphai(String monphai) {
        this.monPhai = monphai;
        return this;
    }

    public KiemTheAccount hephai(String hephai) {
        this.hePhai = hephai;
        return this;
    }
}
