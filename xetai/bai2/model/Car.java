package bai2.model;

public class Car extends TranSport {
    private int choNgoi;
    private String kieuXe;

    public Car(String bienSo, String hangSX, int namSX, String chuSH, int choNgoi, String kieuXe) {
        super(bienSo, hangSX, namSX, chuSH);
        this.choNgoi = choNgoi;
        this.kieuXe = kieuXe;
    }

    public Car() {
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public void inThongTin() {
        System.out.println("======== Thông tin xe oto ===========");
        super.inThongTin();
        System.out.println("số chỗ ngồi:" + this.getChoNgoi());
        System.out.println("kiểu xe:" + this.getKieuXe());
        System.out.println("--------------------------------");
    }
}
