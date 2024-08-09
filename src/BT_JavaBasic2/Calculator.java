package BT_JavaBasic2;

public class Calculator {
    public static int tinhTong(int a, int b) {
        int tong = 0;
        int soA;
        int soB;
        return tong;
    }
    public static double tinhTich (double a, double b) {
        double tich = 0;
        double soA;
        double soB;
        return tich;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        double c = 2.3;
        double d = 3.4;
        System.out.println("Tổng 2 số: " + a + " và " + b + " là: " + tinhTong(a,b) );
        System.out.println("Tích 2 số: " + c + " và " + d + " là: " + tinhTich(c,d) );
    }
}
