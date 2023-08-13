public class KySu extends CanBo{
    String nganhDaoTao;
    KySu(){

    }

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public String toString(){
        return "Thông tin Kỹ Sư: Tên - "
                + this.hoTen
                + ", tuổi - "
                + this.tuoi
                + ", Giới tính - "
                + this.gioiTinh
                + ", Địa chỉ - "
                + this.diaChi
                + ", Ngành đào tạo - "
                + this.nganhDaoTao;
    }
}
