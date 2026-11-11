package BTTuan8;

public class Main {
    public static void main(String[] args) {
        Sach s = new Sach(
            "S001",
            "Lap trinh Java",
            "Nguyen Van A",
            2024,
            10
        );

        System.out.println("===== THONG TIN SACH BAN DAU =====");
        s.hienThiThongTin();

        System.out.println("\n===== CAP NHAT THONG TIN =====");
        s.setTieuDe("Lap trinh Java nang cao");
        s.setTacGia("Tran Van B");
        s.setNamXuatBan(2025);
        s.setSoLuong(20);
        s.hienThiThongTin();

        System.out.println("\n===== KIEM TRA DU LIEU =====");
        s.setNamXuatBan(2030);
        s.setSoLuong(-5);

        System.out.println("\n===== THONG TIN SAU KIEM TRA =====");
        s.hienThiThongTin();
    }
}
