package BT_JavaBasic5;

import java.util.ArrayList;

public class JavaBasic5 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        for (int i =0; i <= 50; i++) {
            if (i%2 == 0){
                System.out.println(i);
                arr.add(i);
            }
        }
        System.out.println("Các phần tử có trong Mảng là: ");
        for (Object i : arr)
            System.out.println(i);

    }
}
