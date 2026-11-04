import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    // Lop Sach
    static class Sach {
        String maSach;
        String tenSach;
        int soLuong;
        double donGia;
        Sach(String maSach, String tenSach, int soLuong, double donGia) {
            this.maSach = maSach;
            this.tenSach = tenSach;
            this.soLuong = soLuong;
            this.donGia = donGia;
        }
    }
    static ArrayList<Sach> dsSach = new ArrayList<>();
    // Bai 1: Nhap n sach bang vong lap
    static void nhapSach() {
        System.out.print("Nhap so luong sach: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap sach thu " + (i + 1));
            System.out.print("Ma sach: ");
            String ma = sc.nextLine();
            System.out.print("Ten sach: ");
            String ten = sc.nextLine();
            System.out.print("So luong: ");
            int sl = Integer.parseInt(sc.nextLine());
            System.out.print("Don gia: ");
            double gia = Double.parseDouble(sc.nextLine());
            dsSach.add(new Sach(ma, ten, sl, gia));
        }
    }
    // Bai 2: Tinh tong so luong va tong gia tri sach
    static void tinhTong() {
        int tongSoLuong = 0;
        double tongGiaTri = 0;
        for (Sach s : dsSach) {
            tongSoLuong += s.soLuong;
            tongGiaTri += s.soLuong * s.donGia;
        }
        System.out.println("\nTong so luong sach: " + tongSoLuong);
        System.out.println("Tong gia tri sach: " + tongGiaTri);
    }
    // Bai 4: Tim sach theo ma
    static void timSach() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();
        boolean timThay = false;
        for (Sach s : dsSach) {
            if (s.maSach.equalsIgnoreCase(ma)) {
                System.out.println("\nTim thay sach!");
                System.out.println("Ma sach: " + s.maSach);
                System.out.println("Ten sach: " + s.tenSach);
                System.out.println("So luong: " + s.soLuong);
                System.out.println("Don gia: " + s.donGia);
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach!");
        }
    }
    // Ham main: Bai 3 - Menu lap den khi chon Thoat
    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n===== QUAN LY THU VIEN =====");
            System.out.println("1. Nhap n sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    nhapSach();
                    break;
                case 2:
                    tinhTong();
                    break;
                case 3:
                    timSach();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
}