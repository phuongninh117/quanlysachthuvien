package BTTuan9;
import java.util.ArrayList;

public class Main {
    static ArrayList<Sach> dsSach = new ArrayList<>();

    public static void Nhap() {
        System.out.print("Nhap so luong sach: ");
        int n = Integer.parseInt(Sach.sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("\n1. Sach giao khoa");
            System.out.println("2. Sach tham khao");
            System.out.print("Chon loai sach: ");
            int chon = Integer.parseInt(Sach.sc.nextLine());
            Sach s;
            if (chon == 1) {
                s = new SachGiaoKhoa();
            } else if (chon == 2) {
                s = new SachThamKhao();
            } else {
                System.out.println("Lua chon khong hop le!");
                i--;
                continue;
            }
            s.Nhap();
            dsSach.add(s);
        }
    }

    public static void Xuat() {
        if (dsSach.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }
        for (Sach s : dsSach) {
            System.out.println("----------------------");
            s.Xuat();
        }
    }

    public static void TinhTongThanhTien() {
        double tongSGK = 0;
        double tongSTK = 0;
        for (Sach s : dsSach) {
            if (s instanceof SachGiaoKhoa) {
                tongSGK += s.TinhThanhTien();
            } else if (s instanceof SachThamKhao) {
                tongSTK += s.TinhThanhTien();
            }
        }
        System.out.println("Tong thanh tien sach giao khoa: " + tongSGK);
        System.out.println("Tong thanh tien sach tham khao: " + tongSTK);
    }

    public static void TinhTrungBinhDonGia() {
        double tong = 0;
        int dem = 0;
        for (Sach s : dsSach) {
            if (s instanceof SachThamKhao) {
                tong += s.getDonGia();
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Khong co sach tham khao!");
        } else {
            System.out.println("Trung binh don gia sach tham khao: "
                    + tong / dem);
        }
    }

    public static void XuatSachNXBX() {
    System.out.print("Nhap ten nha xuat ban can tim: ");
    String tenNXB = Sach.sc.nextLine();
    boolean timThay = false;
    for (Sach s : dsSach) {
        if (s instanceof SachGiaoKhoa
                && s.getNhaXuatBan().equalsIgnoreCase(tenNXB)) {
            s.Xuat();
            System.out.println("----------------------");
            timThay = true;
        }
    }
    if (!timThay) {
        System.out.println("Khong tim thay sach giao khoa cua NXB " + tenNXB);
    }
    }
    
    // Menu
    public static void Menu() {
        int chon;
        do {
            System.out.println("\n========== QUAN LY SACH THU VIEN ==========");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2. Xuat danh sach sach");
            System.out.println("3. Tinh tong thanh tien tung loai");
            System.out.println("4. Tinh trung binh don gia sach tham khao");
            System.out.println("5. Xuat sach giao khoa cua NXB X");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(Sach.sc.nextLine());
            switch (chon) {
                case 1:
                    Nhap();
                    break;
                case 2:
                    Xuat();
                    break;
                case 3:
                    TinhTongThanhTien();
                    break;
                case 4:
                    TinhTrungBinhDonGia();
                    break;
                case 5:
                    XuatSachNXBX();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);
    }

    public static void main(String[] args) {
        Menu();
    }
}


