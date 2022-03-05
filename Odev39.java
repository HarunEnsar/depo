import java.util.Scanner;

public class Odev39 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*Ödev
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
         çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
        int n;
        int toplam=0;
        do {
            System.out.print("Bir sayı girin: ");
            n= input.nextInt();
            if (n%2==0 && n%4==0){
                toplam=toplam+n;
            }
        }while(n%2==0);
        System.out.println("Toplam: "+toplam);

    }
}
