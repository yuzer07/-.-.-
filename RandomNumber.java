import java.util.Scanner;

/**
 * Created by Кирилл on 18.11.2016.
 */
public class RandomNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = 100;
        int mass[] = new int[10];
        for (int i = 0; i < 4; i++) {
            mass[i] = (int) Math.floor(Math.random() * max);
            System.out.print(mass[i] + " ");
            }
        for (int j = 0; j < 5; j++) {
            mass[j] = (int) Math.floor(Math.random() * max);
            System.out.println(mass[j]);
        }
    }
}
