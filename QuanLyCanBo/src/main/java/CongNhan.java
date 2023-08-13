public class CongNhan extends CanBo{
    int bac;
    CongNhan(){

    }
    CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac){
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString(){
        return "Thông tin Công Nhân: Tên - "
                + this.hoTen
                + ", tuổi - "
                + this.tuoi
                + ", Giới tính - "
                + this.gioiTinh
                + ", Địa chỉ - "
                + this.diaChi
                + ", bậc - "
                + this.bac;
    }
}
