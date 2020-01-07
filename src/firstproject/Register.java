package firstproject;
import java.util.Random;

public class Register {
    public static void main(String[] args) {

        Random phoneNo = new Random();
        int[] number = new int[11];
        String start = "053";


        for (int j = 0; j <= 100; j++) {
            System.out.println(j + "Phone Number");
            for (int i = 0; i <= 8; i++) {
                number[i] = phoneNo.nextInt(10);
            }
            System.out.println("number : " + start + number[0] + number[1] + number[2] + number[3] + number[4] + number[5] + number[6] + number[7]);

        }
        System.out.println("hello world");
    }


}
