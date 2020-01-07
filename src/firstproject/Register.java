package firstproject;
import java.util.Random;

public class Register {
    public static void main(String[] args) {

        Random telno = new Random();
        int[] sayilar = new int[11];
        String start = "053";


        for (int j = 0; j <= 100; j++) {
            System.out.println(j + "telefon numarası");
            for (int i = 0; i <= 8; i++) {
                sayilar[i] = telno.nextInt(10);
            }
            System.out.println("number : " + start + sayilar[0] + sayilar[1] + sayilar[2] + sayilar[3] + sayilar[4] + sayilar[5] + sayilar[6] + sayilar[7]);

        }
        System.out.println("hello world");
    }


}
