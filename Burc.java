import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Buru : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
            */
        int day,month;
        System.out.println("BURÇ HESAPLAMA");
        System.out.print("Kaçında ayda doğdunuz:");
        month= input.nextInt();
        System.out.print("Ayın kaçında doğdunuz:");
        day= input.nextByte();
        if(month==1){
            if(day<=31 && day>=1){
                System.out.println("OCAK");
                if(day<22){
                System.out.println("OĞLAK");
                }
             else {
                System.out.println("Kova");
                }
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }

        else if(month==2){
            System.out.println("ŞUBAT");
            if(day<=28 && day>=1){
                if(day<20){
                    System.out.println("Kova");
                }
                else {
                    System.out.println("Balık");
                }
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }

        else if(month==3){
            if(day<=31 && day>=1){
                System.out.println("MART");
                if(day<21){
                    System.out.println("Balık");
                }
                else {
                    System.out.println("Koç");
                }
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }

        else if(month==4){
            if(day<=30 && day>=1){
                System.out.println("NİSAN");
                if(day<21){
                    System.out.println("Koç");
                }
                else {
                    System.out.println("Boğa");
                }
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }

        else if(month==5){
            System.out.println("MAYIS");
            if(day<=31 && day>=1){
                if(day<22){
                    System.out.println("Boğa");
                }
                else {
                    System.out.println("İkizler");
                }
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }

        else if(month==6){
            System.out.println("HAZİRAN");

            if(day<=30 && day>=1){
                if(day<23){
                    System.out.println("İkizler");
                }
                else {
                    System.out.println("Yengeç");
                }
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }

        else if(month==7){
            System.out.println("TEMMUZ");
            if(day<=31 && day>=1){
                if(day<23){
                    System.out.println("Yengeç");
                }
                else {
                    System.out.println("Aslan");
                }
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }

        else if(month==8){
            System.out.println("AĞUSTOS");
            if(day<=31 && day>=1){
                if(day<23){
                    System.out.println("Aslan");
                }
                else {
                    System.out.println("Başak");
                }
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }

        else if(month==9){
            System.out.println("EYLÜL");
            if(day<=30 && day>=1){
                if(day<23){
                    System.out.println("Başak");
                }
                else {
                    System.out.println("Terazi");
                }
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }

        else if(month==10){
            System.out.println("EKİM");
            if(day<=31 && day>=1){
                if(day<23){
                    System.out.println("Terazi");
                }
                else {
                    System.out.println("Akrep");
                }
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }

        else if(month==11){
            System.out.println("KASIM");
            if(day<=30 && day>=1){
                if(day<22){
                    System.out.println("Akrep");
                }
                else {
                    System.out.println("Yay");
                }
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }

        else if(month==12){
            System.out.println("ARALIK");
            if(day<=31 && day>=1){
                if(day<22){
                    System.out.println("Yay");
                }
                else {
                    System.out.println("Oğlak");
                }
            }
            else{
                System.out.println("Yanlış gün girdiniz.");
            }
        }


















    }
}
