package BTTuan6;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    // Bai 1: Mang so luong 5 cuon sach
    static void bai1() {
        int[] soLuong = new int[5];
        int tong = 0;
        System.out.println("===== BAI 1: MANG =====");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
        }
        int max = soLuong[0];
        System.out.println("\nDanh sach so luong sach:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Sach " + (i + 1) + ": " + soLuong[i]);
            tong += soLuong[i];
            if (soLuong[i] > max) {
                max = soLuong[i];
            }
        }
        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max);
    }
    // Bai 2: Danh sach ma sach
    static ArrayList<String> maSach = new ArrayList<>();
    // Bai 3: Danh sach thong tin sach
    static ArrayList<String> danhSachSach = new ArrayList<>();
    // Tim vi tri sach theo ma
    static int timViTri(String ma) {
        for (int i = 0; i < maSach.size(); i++) {
            if (maSach.get(i).equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }
    // Them sach
    static void themSach() {
        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();
        if (maSach.contains(ma)) {
            System.out.println("Ma sach da ton tai!");
            return;
        }
        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();
        System.out.print("Nhap so luong: ");
        int sl = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia: ");
        double gia = Double.parseDouble(sc.nextLine());
        maSach.add(ma);
        danhSachSach.add(ma + "|" + ten + "|" + sl + "|" + gia);
        System.out.println("Them sach thanh cong!");
    }
    // Hien thi sach
    static void hienThiSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach sach rong!");
            return;
        }
        System.out.println("\n===== DANH SACH MA SACH =====");
        for (String ma : maSach) {
            System.out.println(ma);
        }
        System.out.println("\n===== THONG TIN SACH =====");
        for (String s : danhSachSach) {
            String[] a = s.split("\\|");
            System.out.println("Ma sach: " + a[0]);
            System.out.println("Ten sach: " + a[1]);
            System.out.println("So luong: " + a[2]);
            System.out.println("Don gia: " + a[3]);
            System.out.println("----------------------");
        }
    }
    // Tim sach
    static void timSach() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if (vt == -1) {
            System.out.println("Khong tim thay sach!");
        } else {
            System.out.println("Tim thay sach:");
            System.out.println(danhSachSach.get(vt));
        }
    }
    // Xoa sach
    static void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if (vt == -1) {
            System.out.println("Khong tim thay sach!");
        } else {
            maSach.remove(vt);
            danhSachSach.remove(vt);

            System.out.println("Xoa sach thanh cong!");
        }
    }
    // Sua sach
    static void suaSach() {
        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if (vt == -1) {
            System.out.println("Khong tim thay sach!");
            return;
        }
        System.out.print("Nhap ten sach moi: ");
        String ten = sc.nextLine();
        System.out.print("Nhap so luong moi: ");
        int sl = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia moi: ");
        double gia = Double.parseDouble(sc.nextLine());
        danhSachSach.set(vt, ma + "|" + ten + "|" + sl + "|" + gia);
        System.out.println("Sua sach thanh cong!");
    }
    // Bai 4: Tinh tong so luong
    static void tinhTongSoLuong() {
        int tong = 0;
        for (String s : danhSachSach) {
            String[] a = s.split("\\|");
            tong += Integer.parseInt(a[2]);
        }
        System.out.println("Tong so luong sach: " + tong);
    }
    // Tinh tong gia tri
    static void tinhTongGiaTri() {
        double tong = 0;
        for (String s : danhSachSach) {
            String[] a = s.split("\\|");
            int sl = Integer.parseInt(a[2]);
            double gia = Double.parseDouble(a[3]);
            tong += sl * gia;
        }
        System.out.println("Tong gia tri sach: " + tong);
    }
    // Ham main
    public static void main(String[] args) {
        bai1();
        int chon;
        do {
            System.out.println("\n===== QUAN LY THU VIEN =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    themSach();
                    break;
                case 2:
                    hienThiSach();
                    break;
                case 3:
                    timSach();
                    break;
                case 4:
                    xoaSach();
                    break;
                case 5:
                    suaSach();
                    break;
                case 6:
                    tinhTongSoLuong();
                    break;
                case 7:
                    tinhTongGiaTri();
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 8);
        sc.close();
    }
}
