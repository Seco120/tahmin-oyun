import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int sayi = 1+rand.nextInt(100);
        int hak = 2;
        System.out.println("Oyuna başlamak için lütfen adınızı giriniz:");
        String ad = input.nextLine();
        System.out.println("Merhaba "+ ad + ", lütfen tahmin ettiğiniz sayıyı giriniz: ");
        for (int i = 0; i < 3; i++) {
        int veri = input.nextInt();
            if (veri == sayi) {
            System.out.println("Tebrikler, bildiniz!");
            break;
        }
        else {

            if(hak == 0){
                System.out.println("Yanlış tahmin!\nHakkınız kalmadı.\nSayı: "+ sayi + "\nOyunu kaybettiniz! ");
                break;
            }
            else {
                System.out.println(hak + " hakkınız kaldı.");
                hak--;
                if (veri > sayi+20){
                    System.out.println("Tahmininiz çok uzak, Sayıyı azaltıp tekrar deneyiniz.");
                }
                else if (veri > sayi+10) {
                    System.out.println("Tahmininiz uzak, Sayıyı azaltıp tekrar deneyiniz.");
                }
                else if (veri > sayi+5) {
                    System.out.println("Tahmininiz yakın, Sayıyı biraz azaltıp tekrar deneyiniz.");
                }
                else if (veri > sayi) {
                    System.out.println("Tahmininiz çok yakın, Sayıyı biraz azaltıp tekrar deneyiniz.");
                }
                else if (veri < sayi-20) {
                    System.out.println("Tahmininiz çok uzak, Sayıyı arttırıp tekrar deneyiniz.");
                }
                else if (veri < sayi-10) {
                    System.out.println("Tahmininiz uzak, Sayıyı arttırıp tekrar deneyiniz.");
                }
                else if (veri < sayi-5) {
                    System.out.println("Tahmininiz yakın, Sayıyı biraz arttırıp tekrar deneyiniz.");
                }
                else if (veri < sayi) {
                    System.out.println("Tahmininiz çok yakın, Sayıyı biraz arttırıp tekrar deneyiniz.");
                }

           }

       }

       }
    }
}

