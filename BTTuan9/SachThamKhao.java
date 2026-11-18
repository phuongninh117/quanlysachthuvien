package BTTuan9;

public class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao() {
        super();
    }

    public SachThamKhao(String maSach, String ngayNhap,
            double donGia, int soLuong, String nhaXuatBan,
            double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhap thue: ");
        thue = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double TinhThanhTien() {
        return soLuong * donGia + thue;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Thue: " + thue);
        System.out.println("Thanh tien: " + TinhThanhTien());
    }
}
