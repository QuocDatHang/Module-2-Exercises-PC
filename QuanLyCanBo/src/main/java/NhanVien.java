public class NhanVien extends CanBo{
    String congViec;

    NhanVien(){

    }

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString(){
        return "Thông tin Nhân Viên: Tên - "
                + this.hoTen
                + ", tuổi - "
                + this.tuoi
                + ", Giới tính - "
                + this.gioiTinh
                + ", Địa chỉ - "
                + this.diaChi
                + ", Công việc - "
                + this.congViec;
    }
}
