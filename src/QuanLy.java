public interface QuanLy<T> {
    void hienThi();
    void them(T t);
    void sua(String soDienThoai, T t);
    int timKiemTheoSoDienThoai(String soDienThoai);
    void xoa(String  soDienThoai);
}
