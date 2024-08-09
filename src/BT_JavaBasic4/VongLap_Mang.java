package BT_JavaBasic4;

public class VongLap_Mang {
    public static void main(String[] args) {
        int a[] = new int[26];
        int index =0;
        for (int i =0; i <= 50; i++) {
            if (i%2 == 0){
                System.out.println(i);
                a[index] = i;
                index++;
            }
        }
        System.out.println("=====================");
        for (int i : a)
            System.out.println(i);

    }
}
