import java.util.Scanner;

public class VucutKe {
    public static void main(String[] args) {
        System.out.println("Vücut Kitle İndeksi Hesaplama");
        Scanner input = new Scanner(System.in);
        double boy, kilo, vEndex;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();
        vEndex = (kilo) / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + vEndex);


    }
}
