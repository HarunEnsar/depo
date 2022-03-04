import java.util.Scanner;

public class Odev38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();
        int toplam=0,n=0;
        for (int i = 0; i < sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                toplam=toplam+i;
                n++;
            }
        }
        System.out.println("Toplam: "+toplam+" adet: "+n);
        double ort=toplam/n;
        System.out.println("Ortalama: "+ort);

    }
}
