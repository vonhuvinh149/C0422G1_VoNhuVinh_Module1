package bai2.model;

public abstract class TranSport {
private String bienSo ;
private String hangSX;
private int namSX ;
private String chuSH ;

    public TranSport(String bienSo, String hangSX, int namSX, String chuSH) {
        this.bienSo = bienSo;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.chuSH = chuSH;
    }

    public TranSport() {
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getChuSH() {
        return chuSH;
    }

    public void setChuSH(String chuSH) {
        this.chuSH = chuSH;
    }

    public void inThongTin(){
        System.out.println("biển số xe: "+this.getBienSo());
        System.out.println("hãng sản xuất: "+this.getHangSX());
        System.out.println("năm sản xuất: "+this.getNamSX());
        System.out.println("chủ sở hữu: "+this.getChuSH());

    }
}
