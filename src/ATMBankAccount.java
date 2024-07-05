import java.util.Scanner;

public class ATMBankAccount {
    public static void main(String[] args) {
        int balance=1000,select,right=3;
        String username,password;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Kullanıcı adınız: ");
            username = input.nextLine();

            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("java123")){
                System.out.println("Hoşgeldiniz: Lütfen yapmak istediğiniz işlemi seçin");



                do {
                    System.out.println("\n1-Para çek\n2-Para yatır\n3-Bakiye sorgula\n4-Çıkış yap");
                    select = input.nextInt();
                    int amount;
                    switch (select){
                        case 1:
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            amount = input.nextInt();
                            if (amount>balance){
                                System.out.println("Bakiye yetersiz.");
                            }else {
                                balance -= amount;
                            }
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                            amount = input.nextInt();
                            balance += amount;
                            break;
                        case 3:
                            System.out.print("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.print("Tekrar görüşmek üzere");
                            break;
                    }

                }while (select!=4);

                break;

            }else {
                right--;
                System.out.println("Hatalı bilgi girdiniz. Kalan hak: " +right);
            }

        }while (right>0);


    }
}
