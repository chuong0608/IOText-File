import java.util.ArrayList;
import java.util.List;

public class QuanLyDanhBa implements QuanLy<DanhBa> {
   private List<DanhBa> danhBas  = new ArrayList<>();

    public QuanLyDanhBa(List<DanhBa> danhBas) {
        this.danhBas = danhBas;
    }

    public List<DanhBa> getDanhBas() {
        return danhBas;
    }

    public void setDanhBas(List<DanhBa> danhBas) {
        this.danhBas = danhBas;
    }

    public QuanLyDanhBa() {
        danhBas.add(new DanhBa("0348005557","Nhóm 2","Anh","Nam",
                "Phú Thọ","06//08/2000","abcnxnzxcn@gmail.com"));
        danhBas.add(new DanhBa("0348995558","Nhóm 2","Chương","Nam",
                "Phú Thọ","06//08/2000","chuongtep113@gmail.com"));
        danhBas.add(new DanhBa("0343405555","Nhóm 4","An","Nam",
                "Phú Thọ","06//08/2000","nguyenduyan@gmail.com"));
        danhBas.add(new DanhBa("0348066666","Nhóm 1","Duy","Nam",
                "Phú Thọ","06//08/2000","duyquangpha@gmail.com"));
        danhBas.add(new DanhBa("0348088888","Nhóm 3","Linh","Nam",
                "Phú Thọ","06//08/2000","Linhashdkj@gmail.com"));
    }

    @Override
    public void hienThi() {
        for (DanhBa e: danhBas
             ) {
            System.out.println(e);
        }
        System.out.println("--------------------------");
    }

    @Override
    public void them(DanhBa danhBa) {
        danhBas.add(danhBa);
    }

    @Override
    public void sua(String soDienThoai, DanhBa danhBa) {
        if(timKiemTheoSoDienThoai(soDienThoai)== -1){
            System.out.println("Không có danh bạ muốn sửa! ");
        }else {
            danhBas.set(timKiemTheoSoDienThoai(soDienThoai),danhBa);
        }
    }

    @Override
    public int timKiemTheoSoDienThoai(String soDienThoai) {
        for (int i = 0; i < danhBas.size() ; i++) {
            if (danhBas.get(i).getSoDienThoai().equals( soDienThoai)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void xoa(String soDienThoai) {
        if(timKiemTheoSoDienThoai(soDienThoai) == -1){
            System.out.println("Không có danh bạ muốn xóa !");
        }else {
            danhBas.remove(timKiemTheoSoDienThoai(soDienThoai));
        }
    }
    public void timKiemChung(String soDienThoai) {
        for (int i = 0; i <danhBas.size(); i++) {
            if(danhBas.get(i).getSoDienThoai().contains(soDienThoai)){
                System.out.println(danhBas.get(i));
            }

        }
    }
    public void hienThiTimKiem(String soDienThoai){
        for (int i = 0; i < danhBas.size() ; i++) {
            if (danhBas.get(i).getSoDienThoai().equals(soDienThoai)){
                System.out.println(danhBas.get(i));
            }
        }
    }

}
