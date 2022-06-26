package bai2.model;

public class MotorBike extends TranSport {
    private int congSuat;

    public MotorBike(String bienSo, String hangSX, int namSX, String chuSH, int congSuat) {
        super(bienSo, hangSX, namSX, chuSH);
        this.congSuat = congSuat;
    }

    public MotorBike() {
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void inThongTin() {
        System.out.println("======== Thông tin xe máy ===========");
        super.inThongTin();
        System.out.println("công suất: "+ this.getCongSuat() );
        System.out.println("--------------------------------");
    }
}
