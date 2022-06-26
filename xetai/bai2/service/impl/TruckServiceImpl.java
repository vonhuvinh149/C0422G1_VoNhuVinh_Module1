package bai2.service.impl;

import bai2.model.Truck;
import bai2.service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckServiceImpl implements Service {
    ArrayList<Truck> truckArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    /// hàm kiểm tra xe biển số nhập vào có bị trùng k
    public boolean kiemTra(String x) {
        boolean flag = true;
        for (Truck truck : truckArrayList) {
            if (truck.getBienSo().equals(x)) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    // thêm ,mới phương tiện
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
            System.out.println("nhập tải trọng");
            Double taiTrong = Double.parseDouble(sc.nextLine());
            Truck truck = new Truck(bienSo, hangSX, namSx, chuSh, taiTrong);
            truckArrayList.add(truck);
        } catch (Exception e) {
            System.out.println("!!! nhập sai vui lòng chọn lại");
        }
    }

    // hiên thị phương tiện
    @Override
    public void display() {
        if (truckArrayList.isEmpty()) {
            System.out.println("ko có xe tải nào trong danh sách ");
        }
        if (!truckArrayList.isEmpty()) {
            for (Truck x : truckArrayList) {
                x.inThongTin();
            }
        }
    }

    // xoá phương tiện theo biển số
    @Override
    public void remove(String x) {
        if (truckArrayList.isEmpty()) {
            System.out.println("không có xe tải nào trong danh sách");
        }
        for (Truck s : truckArrayList) {
            if (!s.getBienSo().equals(x)) {
                System.out.println("không tìm thấy biển số '" + x + "' trong danh sách xe tải  ");
                break;
            } else {
                System.out.println("---Tìm thấy 1 xe tải có biển " + x + "---");
                display();
                System.out.println("bạn có muốn xoá ko? (yes/no)");
                String nhap = sc.nextLine();
                if (nhap.equalsIgnoreCase("yes")) {
                    truckArrayList.remove(s);
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

    // tìm kiếm theo biển số
    @Override
    public void search(String x) {
        for (Truck s : truckArrayList) {
            if (!s.getBienSo().equals(x)) {
                System.out.println("không tìm thấy biển số '" + x + "' trong danh sách xe tải  ");
                break;
            } else {
                System.out.println("---Tìm thấy 1 xe máy có biển " + x + "---");
                display();
                break;
            }
        }
    }


}
