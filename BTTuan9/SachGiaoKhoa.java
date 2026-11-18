package BTTuan9;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public SachGiaoKhoa() {
        super();
    }

    public SachGiaoKhoa(String maSach, String ngayNhap,
            double donGia, int soLuong, String nhaXuatBan,
            String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public void Nhap() {
    super.Nhap();
    System.out.print("Nhap tinh trang (moi/cu): ");
    tinhTrang = sc.nextLine();
    }
    
    @Override
    public double TinhThanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * 0.5;
        }
    }

    @Override
    public void Xuat() {
        super.Xuat();

        System.out.println("Tinh trang: " + tinhTrang);
        System.out.println("Thanh tien: " + TinhThanhTien());
    }
}
