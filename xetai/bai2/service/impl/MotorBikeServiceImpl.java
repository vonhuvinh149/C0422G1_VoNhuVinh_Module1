package bai2.service.impl;

import bai2.model.MotorBike;
import bai2.service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorBikeServiceImpl implements Service {
    ArrayList<MotorBike> motorBikeArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    // hàm kiểm tra xem biển số đã tồn tại trong danh sách hay ch
    public boolean kiemTra(String x) {
        boolean flag = true;
        for (MotorBike motorBike : motorBikeArrayList) {
            if (motorBike.getBienSo().equals(x)) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    //chức năng thêm phương tiện
    @Override
    public void add() {
        try {
            System.out.println("nhập biển số xe");
            String bienSo = sc.nextLine();
            if (!kiemTra(bienSo)) {
                System.out.println("biển số xe đã tòn tại");
                return;
            }
            System.out.println("nhập hãng sản xuất");
            String hangSX = sc.nextLine();
            System.out.println("nhập năm sản xuất");
            int namSx = Integer.parseInt(sc.nextLine());
            System.out.println("nhập tên chủ sở hữu");
            String chuSh = sc.nextLine();
            System.out.println("nhập công suất");
            int congSuat = Integer.parseInt(sc.nextLine());
            MotorBike motorBike = new MotorBike(bienSo, hangSX, namSx, chuSh, congSuat);
            motorBikeArrayList.add(motorBike);
        } catch (Exception e) {
            System.out.println("!!! nhập sai vui lòng chọn lại ");
        }
    }

    // chức năng hiển thị
    @Override
    public void display() {
        if (motorBikeArrayList.isEmpty()) {
            System.out.println("ko có xe máy nào trong danh sách ");
        }
        if (!motorBikeArrayList.isEmpty()) {
            for (MotorBike x : motorBikeArrayList) {
                x.inThongTin();
            }
        }
    }

    // chức năng xoá
    @Override
    public void remove(String x) {

        // nếu danh sách rỗng thì hiển thị thông báo
        if (motorBikeArrayList.isEmpty()) {
            System.out.println("không có xe máy nào trong danh sách");
        }
        // duyệt qua danh sách để tìm kiếm biển số xe
        for (MotorBike s : motorBikeArrayList) {
            // nếu không tìm thấy thì hiển thị thông báo
            if (!s.getBienSo().equals(x)) {
                System.out.println("không tìm thấy biển số '" + x + "' trong danh sách xe máy");
                break;
            } else {
                // nếu tìm thấy thì tiến hành xoá
                System.out.println("---Tìm thấy 1 xe máy có biển " + x + "---");
                display();
                System.out.println("tìm thấy 1 xe máy muốn xoá ko? (yes/no)");
                String nhap = sc.nextLine();
                if (nhap.equalsIgnoreCase("yes")) {
                    motorBikeArrayList.remove(s);
                    System.out.println("đã xoá thành công");
                    break;
                } else if (nhap.equalsIgnoreCase("no")) {
                    System.out.println("huỷ xoá thành công");
                    break;
                } else {
                    System.out.println("nhập sai");
                    break;
                }
            }
        }
    }

    // chức năng tìm kiếm
    @Override
    public void search(String x) {
        for (MotorBike s : motorBikeArrayList) {
            if (!s.getBienSo().equals(x)) {
                System.out.println("không tìm thấy biển số '" + x + "' trong danh sách xe máy");
                break;
            } else {
                System.out.println("---Tìm thấy 1 xe máy có biển " + x + "---");
                display();
                break;
            }
        }
    }

}
