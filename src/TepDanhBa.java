import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class TepDanhBa {
    public static void ghiTep(List<DanhBa> danhBas) throws FileNotFoundException {
        File file = new File("ouput.csv");
        PrintWriter printWriter = new PrintWriter(file);
        String str = "số điện thoại,nhóm,họ tên,giới tính,địa chỉ,ngày sinh,email \n";
        for (DanhBa i : danhBas) {
            str += i.getSoDienThoai() + "," + i.getNhom() + "," + i.getHoTen() + "," +
                    i.getGioiTinh() + "," + i.getDiaChi() + "," + i.getNgaySinh() + "," +
                    i.getEmail() + "\n";
        }
        printWriter.println(str);
        printWriter.close();
    }

    public static List<DanhBa> docTep() throws FileNotFoundException {
        FileReader fileReader = new FileReader("ouput.csv");
        Scanner scanner = new Scanner(fileReader);
        String noiDung = scanner.nextLine();
        while (scanner.hasNextLine()) {
            noiDung = scanner.nextLine();
            System.out.println(noiDung);
            String[] value = noiDung.split(",");

        }
        return null;
    }
}
