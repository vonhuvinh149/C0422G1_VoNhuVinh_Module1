package bai2.model;

public class Truck extends TranSport {
    private Double taiTrong;

    public Truck(String bienSo, String hangSX, int namSX, String chuSH, Double taiTrong) {
        super(bienSo, hangSX, namSX, chuSH);
        this.taiTrong = taiTrong;
    }

    public Truck() {
    }

    public Double getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(Double taiTrong) {
        this.taiTrong = taiTrong;
    }

    @Override
    public void inThongTin() {
        System.out.println("======== Thông tin xe tải ===========");
        super.inThongTin();
        System.out.println("tải trong : " + this.getTaiTrong());
        System.out.println("------------------------------");
    }
}
