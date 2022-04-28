import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        QuanLyDanhBa quanLyDanhBa = new QuanLyDanhBa();
//        file.createNewFile();
        String str = "                -----------Menu------------ +\n" +
                "                1. Hiển thị danh bạ  \n" +
                "                2. Thêm mới danh bạ  \n" +
                "                3. Cập nhập danh bạ  \n" +
                "                4. Xóa danh bạ  \n" +
                "                5. Tìm kiếm danh bạ \n" +
                "                6. Ghi vào file  \n" +
                "                7. Đọc vào file  \n" +
                "                8. Thoát.";
        do {
            System.out.println(str);
            Scanner scanner = new Scanner(System.in);
            int chucNang = scanner.nextInt();
            scanner.nextLine();
            switch (chucNang) {
                case 1: {
//                    Hiển thị danh bạ
                    quanLyDanhBa.hienThi();
                    break;
                }
                case 2: {
//                    Thêm danh dạ
                    System.out.println("Nhập vào số điện thoại : ");
                    String soDienThoai = scanner.nextLine();
                    System.out.println("Nhập nhóm danh bạ : ");
                    String nhom = scanner.nextLine();
                    System.out.println("Nhập họ tên danh bạ : ");
                    String hoTen = scanner.nextLine();
                    System.out.println("Nhập giới tính : ");
                    String gioiTinh = scanner.nextLine();
                    System.out.println("Nhập địa chỉ : ");
                    String diaChi = scanner.nextLine();
                    System.out.println("Nhập ngày sinh : ");
                    String ngaySinh = scanner.nextLine();
                    System.out.println("Nhập email : ");
                    String email = scanner.nextLine();
                    quanLyDanhBa.them(new DanhBa("" + soDienThoai, nhom, hoTen, gioiTinh, diaChi, ngaySinh, email));
                    break;
                }
                case 3: {
//                    Cập nhập
                    System.out.println("Nhập vào số điện thoại cần sửa : ");
                    String soDienThoai = scanner.nextLine();

                    System.out.println("Nhập vào số điện thoại mới : ");
                    String soDienThoaiSua = scanner.nextLine();
                    System.out.println("Nhập nhóm danh bạ : ");
                    String nhom = scanner.nextLine();
                    System.out.println("Nhập họ tên danh bạ : ");
                    String hoTen = scanner.nextLine();
                    System.out.println("Nhập giới tính : ");
                    String gioiTinh = scanner.nextLine();
                    System.out.println("Nhập địa chỉ : ");
                    String diaChi = scanner.nextLine();
                    System.out.println("Nhập ngày sinh : ");
                    String ngaySinh = scanner.nextLine();
                    System.out.println("Nhập email : ");
                    String email = scanner.nextLine();
                    DanhBa danhBaSua = new DanhBa(soDienThoaiSua,nhom,hoTen,gioiTinh,diaChi,ngaySinh,email);
                    quanLyDanhBa.sua(soDienThoai,danhBaSua);
                    break;
                }
                case 4: {
//                    Xóa danh bạ
                    System.out.println("Nhập vào số điện thoại : ");
                    String soDienThoai = scanner.nextLine();
                    quanLyDanhBa.xoa(soDienThoai);
                    break;
                }
                case 5: {
//                    Tim kiếm danh bạ
                    System.out.println("Nhập vào số điện thoại : ");
                    String soDienThoai = scanner.nextLine();
                    quanLyDanhBa.timKiemChung(soDienThoai);
                    break;
                }
                case 6: {
//                    ghi file
                    TepDanhBa.ghiTep(quanLyDanhBa.getDanhBas());
                    break;
                }
                case 7: {
//                    đọc file
                    TepDanhBa.docTep();
                    break;
                }
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hết lựa chọn ...ok ! ");
            }

        } while (true);
    }
}
