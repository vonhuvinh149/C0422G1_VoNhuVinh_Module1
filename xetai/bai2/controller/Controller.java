package bai2.controller;

import bai2.service.impl.CarServiceImpl;
import bai2.service.impl.MotorBikeServiceImpl;
import bai2.service.impl.TruckServiceImpl;

import java.util.Scanner;

public class Controller {
    static CarServiceImpl carService = new CarServiceImpl();
    static MotorBikeServiceImpl motorBikeService = new MotorBikeServiceImpl();
    static TruckServiceImpl truckService = new TruckServiceImpl();
    static Scanner scanner = new Scanner(System.in);
//    static boolean flag = true;

    public static void DisplayMainMenu() {
        int chon;
        while (true) {
            try {
                System.out.println("****** Menu *******\n");
                System.out.println("1. Thêm mới phương tiện\n" +
                        "2. Hiển thị phương tiện\n" +
                        "3. Xoá phương tiện theo biển kiểm soát\n" +
                        "4. Tim kiếm theo biển số xe \n" +
                        "0. Dừng chương trình\n");
                System.out.println("****** End Menu ******");
                System.out.println("nhập chức năng");
                chon = Integer.parseInt(scanner.nextLine());
                switch (chon) {
                    case 1:
                        // thêm phương tiện
                        addController();
                        break;
                    case 2:
                        // hiển thị phương tiện
                        displayController();
                        break;
                    case 3:
                        removeController();
                        break;
                    case 4:
                        searchController();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("xin mời nhập lại");
                }
            } catch (Exception e) {
                System.out.println("!!! nhập sai vui lòng nhập lại");
            }
        }
    }


    // thêm phương tiện
    public static void addController() {
        int chon;

        try {
            do {
                System.out.println("chọn loại xe muốn thêm");
                System.out.println("1. xe oto\n" +
                        "2. xe tải\n" +
                        "3. xe máy\n" +
                        "0. exit");
                System.out.println("nhập lựa chọn");
                chon = Integer.parseInt(scanner.nextLine());
                switch (chon) {
                    case 1:
                        carService.add();
                        break;
                    case 2:
                        truckService.add();
                        break;
                    case 3:
                        motorBikeService.add();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println(" nhập sai xin mời nhập lại ");
                }
            }
            while (chon != 0);
        } catch (Exception e) {
            System.out.println("!!! nhập sai vui lòng nhập lại");
        }
    }


    // hiển thị phương tiện
    public static void displayController() {
        int chon;
        try {
            do {
                System.out.println("chọn loại xe muốn hiển thị");
                System.out.println("1. xe oto\n" +
                        "2. xe tải\n" +
                        "3. xe máy\n" +
                        "4. hiển thị tất cả phương tiện\n" +
                        "0. exit");
                System.out.println("nhập lựa chọn");
                chon = Integer.parseInt(scanner.nextLine());
                switch (chon) {
                    case 1:
                        carService.display();
                        break;
                    case 2:
                        truckService.display();
                        break;
                    case 3:
                        motorBikeService.display();
                        break;
                    case 4:
                        carService.display();
                        motorBikeService.display();
                        truckService.display();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("nhập sai xin mời nhập lại");
                }
            } while (chon != 0);
        } catch (Exception e) {
            System.out.println("!!! nhập sai vui lòng nhập lại");
        }
    }

    // xoá phương tiện theo biển số
    public static void removeController() {
        System.out.println("nhập biển số xe");
        String bienSo = scanner.nextLine();
        carService.remove(bienSo);
        motorBikeService.remove(bienSo);
        truckService.remove(bienSo);
    }

    // tìm kiếm biển số
    public static void searchController() {
        System.out.println("nhập biển số phương tiện cần tìm kiếm");
        String bienSo = scanner.nextLine();
        carService.search(bienSo);
        truckService.search(bienSo);
        motorBikeService.search(bienSo);
    }
}
