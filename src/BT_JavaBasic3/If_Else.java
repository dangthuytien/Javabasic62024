package BT_JavaBasic3;

public class If_Else {
public static void dieuKien(int n){
    int number = 100;
    if(n==number) {
        System.out.println("Hai số bằng nhau!");
    } else if (n < number) {
        System.out.println(n + " nhỏ hơn " + number);
    }else {
        System.out.println(n + " lớn hơn " + number);
    }
}
    public static void main(String[] args) {
        int a = 50;
        int b = 104;
        int c = 100;
        dieuKien(a);
        dieuKien(b);
        dieuKien(c);
    }
}
