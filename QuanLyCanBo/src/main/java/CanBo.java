public class CanBo {
    String hoTen;
    int tuoi;
    String gioiTinh;
    String diaChi;

    public CanBo(){
    }
    public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String toString(){
        return "Thông tin cán bộ: Tên - "
                + this.hoTen
                + ", tuổi - "
                + this.tuoi
                + ", Giới tính - "
                + this.gioiTinh
                + ", Địa chỉ - "
                + this.diaChi;
    }
}
