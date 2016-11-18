
import java.util.Scanner;

/**
 * Created by Кирилл on 17.11.2016.
 */
public class Hi {
    public static void main (String[]args){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = a.nextLine();
        System.out.println("Привет " + name);
        a.close();
        }
    }
