import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Ứng dụng quản lý cán bộ");
            System.out.println("Nhập 1: để thêm cán bộ mới");
            System.out.println("Nhập 2: để tìm cán bộ theo tên");
            System.out.println("Nhập 3: để hiển thị thông tin tất cả cán bộ");
            System.out.println("Nhập 4: để thoát");
            int number = Integer.parseInt(input.nextLine());
            switch (number) {
                case 1: {
                    System.out.println("Nhập a: để thêm Kỹ Sư");
                    System.out.println("Nhập b: để thêm Công Nhân");
                    System.out.println("Nhập c: để thêm Nhân Viên");
                    String word = input.nextLine();
                    switch (word) {
                        case "a": {
                            System.out.print("Nhập tên: ");
                            String hoTen = input.nextLine();
                            System.out.print("Nhập tuổi: ");
                            int tuoi = Integer.parseInt(input.nextLine());
                            System.out.print("Nhập giới tính: ");
                            String gioiTinh = input.nextLine();
                            System.out.print("Nhập địa chỉ: ");
                            String diaChi = input.nextLine();
                            System.out.print("Nhập ngành đào tạo: ");
                            String nganhDaoTao = input.nextLine();
                            CanBo kySu1 = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
                            qlcb.addCanBo(kySu1);
                            System.out.println(kySu1.toString());
                            break;
                        }

                        case "b": {
                            System.out.print("Nhập tên: ");
                            String hoTen = input.nextLine();
                            System.out.print("Nhập tuổi: ");
                            Integer tuoi = Integer.parseInt(input.nextLine());
                            System.out.print("Nhập giới tính: ");
                            String gioiTinh = input.nextLine();
                            System.out.print("Nhập địa chỉ: ");
                            String diaChi = input.nextLine();
                            System.out.print("Nhập bậc: ");
                            Integer bac = Integer.parseInt(input.nextLine());
                            CanBo congNhan1 = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
                            qlcb.addCanBo(congNhan1);
                            System.out.println(congNhan1.toString());
                            break;
                        }

                        case "c": {
                            System.out.print("Nhập tên: ");
                            String hoTen = input.nextLine();
                            System.out.print("Nhập tuổi: ");
                            Integer tuoi = Integer.parseInt(input.nextLine());
                            System.out.print("Nhập giới tính: ");
                            String gioiTinh = input.nextLine();
                            System.out.print("Nhập địa chỉ: ");
                            String diaChi = input.nextLine();
                            System.out.print("Nhập công việc: ");
                            String congViec = input.nextLine();
                            CanBo nhanVien1 = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
                            qlcb.addCanBo(nhanVien1);
                            System.out.println(nhanVien1.toString());
                            break;
                        }
                        default:
                            System.out.println("Ký tự không hợp lệ");
                            break;
                    }
                    break;
                }
                case 2: {
                    System.out.print("Nhập tên cần tìm kiếm: ");
                    String name = input.nextLine();
                    qlcb.searchCanBoByName(name).forEach(canBo -> {
                        System.out.println(canBo.toString());
                    });
                    break;
                }
                case 3: {
                    qlcb.showDanhSachCanBo();
                    break;
                }
                case 4: {
                    return;
                }
                default:
                    System.out.println("Số không hợp lệ");
                    continue;
            }

        }
    }
}
