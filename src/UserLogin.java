import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName,password;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username: ");
        userName = input.nextLine();

        System.out.println("Enter password: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("Java123")){
            System.out.println("Giriş başarılı");
        }else {
            System.out.println("Giriş başarısız. Bilgileri kontrol ediniz.");
        }


    }
}
