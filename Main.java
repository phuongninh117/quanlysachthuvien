<<<<<<< HEAD
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
=======
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Nhap thong tin sach
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia: ");
        double donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        // 2. Tinh thanh tien
        double thanhTien = donGia * soLuong;
        // 3. Tinh phi van chuyen 5%
        double phiVanChuyen = thanhTien * 0.05;
        // 4. Tinh tong tien nhap
        double tongTienNhap = thanhTien + phiVanChuyen;
        System.out.println("\n===== Bai 1 =====");
        if (donGia > 0) {
            System.out.println("Gia sach hop le");
        } else {
            System.out.println("Gia sach khong hop le");
        }
        if (soLuong >= 0) {
            System.out.println("So luong hop le");
        } else {
            System.out.println("So luong khong hop le");
        }
        if (namXuatBan > 0 && namXuatBan <= 2026) {
            System.out.println("Nam xuat ban hop le");
        } else {
            System.out.println("Nam xuat ban khong hop le");
        }
        System.out.println("\n===== Bai 2 =====");
        if (donGia < 50000) {
            System.out.println("Sach gia thap");
        } else if (donGia <= 100000) {
            System.out.println("Sach gia trung binh");
        } else if (donGia <= 200000) {
            System.out.println("Sach gia cao");
        } else {
            System.out.println("Sach gia dac biet");
        }
        System.out.println("\n===== Bai 3 =====");
        if (soLuong == 0) {
            System.out.println("Het sach");
        } else if (soLuong <= 5) {
            System.out.println("Sap het sach");
        } else if (soLuong <= 20) {
            System.out.println("Con it sach");
        } else {
            System.out.println("Con nhieu sach");
        }
        System.out.println("\n===== Bai 4 =====");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap loai sach: ");
        int loaiSach = Integer.parseInt(sc.nextLine());
        switch (loaiSach) {
            case 1:
                System.out.println("Sach giao khoa");
                break;
            case 2:
                System.out.println("Sach tham khao");
                break;
            case 3:
                System.out.println("Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Sach khac");
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }
        // Hien thi thong tin sach
        System.out.println("\n===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.printf("Don gia: %.0f VND%n", donGia);
        System.out.println("So luong: " + soLuong);
        // Hien thi ket qua
        System.out.printf("Thanh tien: %.0f VND%n", thanhTien);
        System.out.printf("Phi van chuyen: %.0f VND%n", phiVanChuyen);
        System.out.printf("Tong tien nhap: %.0f VND%n", tongTienNhap);
        sc.close();
    }
}
>>>>>>> 82a0dcd0e4161ed1f32fb2ef9a416221b9e4626e
