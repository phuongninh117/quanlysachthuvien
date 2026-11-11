package BTTuan7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Sach> dsSach = new ArrayList<>();

    public static void themSach() {
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();

        System.out.print("Nhap tieu de: ");
        String tieuDe = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        Sach s = new Sach(maSach, tieuDe, tacGia,
                          namXuatBan, soLuong);

        dsSach.add(s);
        System.out.println("Them sach thanh cong!");
    }

    public static void hienThiDanhSach() {
        if (dsSach.isEmpty()) {
            System.out.println("Danh sach sach rong!");
            return;
        }
        for (Sach s : dsSach) {
            System.out.println("--------------------");
            s.hienThiThongTin();
        }
    }

    public static void timSach() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();
        for (Sach s : dsSach) {
            if (s.maSach.equalsIgnoreCase(ma)) {
                System.out.println("Tim thay sach:");
                s.hienThiThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay sach!");
    }

    public static void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();
        for (int i = 0; i < dsSach.size(); i++) {
            if (dsSach.get(i).maSach.equalsIgnoreCase(ma)) {
                dsSach.remove(i);
                System.out.println("Xoa sach thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sach!");
    }

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n===== QUAN LY SACH THU VIEN =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    themSach();
                    break;
                case 2:
                    hienThiDanhSach();
                    break;
                case 3:
                    timSach();
                    break;
                case 4:
                    xoaSach();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 5);
    }
}
