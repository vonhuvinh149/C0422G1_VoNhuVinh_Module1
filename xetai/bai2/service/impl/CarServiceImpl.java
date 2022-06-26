package bai2.service.impl;

import bai2.model.Car;
import bai2.service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class CarServiceImpl implements Service {
    ArrayList<Car> carArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // kiểm tra biển số trùng nha
    public boolean kiemTra(String x) {
        boolean flag = true;
        for (Car car : carArrayList) {
            if (car.getBienSo().equals(x)) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    // chức năng thêm
    @Override
    public void add() {
        try {
            System.out.println("nhập biển số xe");
            String bienSo = sc.nextLine();
            // kiểm tra biển số nhập vào có trung hay ko nếu trùng nhập lại
            if (!kiemTra(bienSo)) {
                System.out.println("--- biển số xe đã tòn tại ---");
                return;
            }
            System.out.println("nhập hãng sản xuất");
            String hangSX = sc.nextLine();
            System.out.println("nhập năm sản xuất");
            int namSx = Integer.parseInt(sc.nextLine());
            System.out.println("nhập tên chủ sở hữu");
            String chuSh = sc.nextLine();
            System.out.println("nhập sô chỗ ngồi");
            int choNgoi = Integer.parseInt(sc.nextLine());
            System.out.println("nhập kiểu xe");
            String kieuXe = sc.nextLine();
            Car cars = new Car(bienSo, hangSX, namSx, chuSh, choNgoi, kieuXe);
            carArrayList.add(cars);
        } catch (Exception e) {
            System.out.println("!!! nhập sai vui lòng chọn lại");
        }
    }


    // chức năng hiển thị xe oto
    @Override
    public void display() {
        if (carArrayList.isEmpty()) {   // nếu danh sách rỗng thì thông báo cho người dùng biết
            System.out.println("bạn chưa nhập thông tin ");
        }
        if (!carArrayList.isEmpty()) {  // nếu ko rỗng thì in ra
            for (Car x : carArrayList) {
                x.inThongTin();
            }
        }
    }


    // chức năng xoá thêo biển số xe
    @Override
    public void remove(String x) {
        if (carArrayList.isEmpty()) {  // nếu danh sách rỗng thì thông báo cho người dùng biết
            System.out.println("không có xe oto nào trong danh sách");
        }
        // duyệt qua danh sách
        for (Car s : carArrayList) {
            // nếu ko tìm thấy biển số trong danh sách thì thông báo ra cho người dùng biết
            if (!s.getBienSo().equals(x)) {
                System.out.println("không tìm thấy biển số '" + x + "' trong danh sách xe oto");
                break;
            } else {
                //nếu tìm thấy thì hiển thị xe tìm thấy và xoá nó đi
                System.out.println("---Tìm thấy 1 xe oto có biển " + x + "---");
                display();
                // nếu muốn xoá thì chọn yes và ngược lại
                System.out.println("bạn có muốn xoá ko? (yes/no)");
                String nhap = sc.nextLine();
                if (nhap.equalsIgnoreCase("yes")) {
                    carArrayList.remove(s);
                    System.out.println("đã xoá thành công");
                    break;
                } else if (nhap.equalsIgnoreCase("no")) {
                    System.out.println("đã huỷ xoá thành công");
                    break;
                } else {
                    System.out.println("nhập sai ");
                    break;
                }

            }
        }
    }



    // chức năng tìm kiếm
    @Override
    public void search(String x) {
        for (Car s : carArrayList) {
            if (!s.getBienSo().equals(x)) {
                System.out.println("không tìm thấy biển số '" + x + "' trong danh sách xe oto");
                break;
            } else {
                System.out.println("---Tìm thấy 1 xe oto có biển " + x + "---");
                display();
                break;
            }
        }
    }
}
