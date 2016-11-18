import java.util.Scanner;

/**
 * Created by Кирилл on 18.11.2016.
 */
public class Password {
    public static void main (String [] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String password1 = "abcd";
        String password = a.nextLine();
        System.out.println(password1.equals(password));
    }
}
