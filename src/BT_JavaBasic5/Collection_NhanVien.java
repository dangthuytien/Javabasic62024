package BT_JavaBasic5;

import java.util.HashMap;

public class Collection_NhanVien {
    public static void NhanVien() {
        HashMap<String, String> nhanvien = new HashMap<String, String>();
        nhanvien.put("MaNV", "NV01");
        nhanvien.put("Họ và tên", "Nguyễn Văn An");
        nhanvien.put("Giới tính", "Nam");
        nhanvien.put("Năm sinh", "2000");
        System.out.println("Thông tin nhân viên: \t");
        System.out.println(nhanvien);
    }


    public static void main(String[] args) {
        Collection_NhanVien.NhanVien();
    }
}
