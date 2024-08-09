package BT_JavaBasic3;

public class OnTapToanTu {
    public static void main(String[] args) {
        int a= 5;
        int b = 10;
        int c = 8;
        System.out.println("So sánh a > b: " + (a > b));
        System.out.println("So sánh b > c: " + (b > c));
        System.out.println((a > b) && (c < b));
        System.out.println((a > b) || (c < b));
        System.out.println("So sánh a = c: " + (a == c));

    }
}
