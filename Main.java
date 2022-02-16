import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //DEĞİŞKENLERİ OLUŞTUR
        int mat, fizik, kimya, turkce, tarih, muzik;
        //scanner sınıfı tanımladık
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuzu girin:");
        mat = inp.nextInt();
        System.out.print("Fizik notunuzu girin:");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuzu girin:");
        kimya = inp.nextInt();
        System.out.print("Türkçe notunuzu girin:");
        turkce = inp.nextInt();
        System.out.print("Tarih notunuzu girin:");
        tarih = inp.nextInt();
        System.out.print("Müzik notunuzu girin:");
        muzik = inp.nextInt();
        double ort = (mat + kimya + fizik + turkce + tarih + muzik) / 6;
        System.out.print("Ortalamanız:" + ort);
        boolean gecme = ort > 60;
        String str = gecme ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print("\n" + str);

    }
}
