package BT_JavaBasic1;

public class SinhVien {
    public String khoa = "Công nghệ thông tin";
    static int namHoc = 2024;

    public static void main(String[] args) {
        String lop = "IT01: ";
        System.out.println("Tên: " + ThongTin.name);
        System.out.println("Giới Tính: " + ThongTin.sex);
        SinhVien sinhVien = new SinhVien();
        System.out.println("Khoa: " + sinhVien.khoa);
        System.out.println("Năm học: " + namHoc);
        System.out.println(lop);

    }
}
