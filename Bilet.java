import java.util.Scanner;

public class Bilet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      /*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın.İlk olarak uçuşun toplam fiyatını hesaplayın
         ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
        yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya
        "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır */
        double mesafe;
        int yas, ytip;
        System.out.print("Yolculuk tipi tekyon ise 0 gidiş dönüş ise 1 i tuşlayın: ");
        ytip = input.nextInt();
        if (ytip == 0)
            System.out.println("Tek Yön");
        if (ytip == 1)
            System.out.println("Gidiş-Dönüş");
        switch (ytip) {
            case 0:
                System.out.print("Gidilecek mesafe(Km):");
                mesafe=input.nextInt();
                System.out.print("Yaşınızı girin: ");
                yas=input.nextInt();

                if(yas<12 && yas>0){
                    double tutar=mesafe*(0.10);
                    System.out.println("İndirimsiz tutar:"+tutar+"TL");
                    System.out.println("12 yaşından küçük olduğunuz için %50 indirim uygulandı");
                    System.out.println("Ücretiniz:"+(tutar/2)+"TL");
                }
                else if(yas<=24 && yas>=12){
                    double tutar=mesafe*(0.10);
                    System.out.println("İndirimsiz tutar:"+tutar+"TL");
                    System.out.println("Yaşınız 12-24 arası olduğu için %10 indirim uygulandı");
                    System.out.println("Ücretiniz:"+(tutar-(tutar*10)/100)+"TL");

                }
                else if (yas>65){
                    double tutar=mesafe*(0.10);
                    System.out.println("İndirimsiz tutar:"+tutar+"TL");
                    System.out.println("65 yaşından büyük olduğunuz için %30 indirim uygulandı");
                    System.out.println("Ücretiniz:"+(tutar-(tutar*30)/100)+"TL");
                }
                else if(yas<0 || mesafe<0){
                    System.out.println("Hatalı veri girdiniz");
                }
                else{
                    double tutar=mesafe*(0.10);
                    System.out.println("Tutar: "+tutar);
                }
                break;
            case 1:
                System.out.print("Gidilecek mesafe(Km):");
                mesafe=input.nextInt();
                System.out.print("Yaşınızı girin: ");
                yas=input.nextInt();
                if(yas<12 && yas>0){
                    double tutar=mesafe*(0.10);
                    System.out.println("İndirimsiz tutar:"+tutar+"TL");
                    System.out.println("12 yaşından küçük olduğunuz için %50 indirim uygulandı");
                    System.out.println("Ücretiniz:"+(tutar/2)+"TL");
                    double gdtutar12;
                    gdtutar12=(tutar/2)-((tutar/2)*20)/100;
                    System.out.println("Gidiş Dönüş Seçtiğiniz için %20 indirim uygulandı\n NET TUTAT: "+gdtutar12+"TL");
                }
                else if(yas<=24 && yas>=12){
                    double tutar=mesafe*(0.10);
                    System.out.println("İndirimsiz tutar:"+tutar+"TL");
                    System.out.println("Yaşınız 12-24 arası olduğu için %10 indirim uygulandı");
                    System.out.println("Ücretiniz:"+(tutar-(tutar*10)/100)+"TL");
                    double gdtutary10=tutar-(tutar*10)/100;
                    double gdtutar24=gdtutary10-(gdtutary10*20)/100;
                    System.out.println("Gidiş Dönüş Seçtiğiniz için %20 indirim uygulandı\n NET TUTAR: "+gdtutar24+"TL");

                }
                else if (yas>65 ){
                    double tutar=mesafe*(0.10);
                    System.out.println("İndirimsiz tutar:"+tutar+"TL");
                    System.out.println("65 yaşından büyük olduğunuz için %30 indirim uygulandı");
                    System.out.println("Ücretiniz:"+(tutar-(tutar*30)/100)+"TL");
                    double gdtutary30=tutar-(tutar*30)/100;
                    double gdtutar65=gdtutary30-(gdtutary30*20)/100;
                    System.out.println("Gidiş Dönüş Seçtiğiniz için %20 indirim uygulandı\n NET TUTAR: "+gdtutar65+"TL");

                }
                else if(yas<0 || mesafe<0){
                    System.out.println("Hatalı veri girdiniz");
                }
                else{
                    double tutar=mesafe*(0.10);
                    double gdtutar=tutar-(tutar*20)/100;
                    System.out.println("Gidiş Dönüş Seçtiğiniz için %20 indirim uygulandı\n NET TUTAR: "+gdtutar+"TL");
                }

                break;
            default:
                System.out.println("Hatalı veri girdiniz");
                break;
        }


    }
}
