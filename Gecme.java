import java.util.Scanner;

public class Gecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, ortmat = 0, fiz, ortfiz = 0, tur, orttur = 0, kim, ortkim = 0, muz, ortmuz = 0,sayac=0;

        System.out.print("Matematik notunuz:");
        mat = input.nextInt();
        if (mat <= 100 && mat >= 0) {
            ortmat=mat;
            sayac++;
        }
        else{
            System.out.println("Not 0 ile 100 arasında olmadığı için hesaba katılmaz.");
        }

        System.out.print("Fizik notunuz:");
        fiz = input.nextInt();
        if (fiz <= 100 && fiz >= 0) {
           ortfiz=fiz;
           sayac++;
        }
        else{
            System.out.println("Not 0 ile 100 arasında olmadığı için hesaba katılmaz.");
        }

        System.out.print("Türkçe notunuz:");
        tur = input.nextInt();
        if (tur <= 100 && tur >= 0) {
            orttur=tur;
            sayac++;
        }
        else{
            System.out.println("Not 0 ile 100 arasında olmadığı için hesaba katılmaz.");
        }

        System.out.print("Kimya notunuz:");
        kim = input.nextInt();
        if (kim <= 100 && kim >= 0) {
            ortkim=kim;
            sayac++;
        }
        else{
            System.out.println("Not 0 ile 100 arasında olmadığı için hesaba katılmaz.");
        }

        System.out.print("Müzik notunuz:");
        muz = input.nextInt();
        if (muz <= 100 && muz >= 0) {
            ortmuz=muz;
            sayac++;
        }
        else{
            System.out.println("Not 0 ile 100 arasında olmadığı için hesaba katılmaz.");
        }
        double ort=(ortfiz+ortkim+ortmat+ortmuz+orttur)/sayac;
        if(ort>=55){
            System.out.println(ort+"puan alarak GEÇTİNİZ");
        }
        else {
            System.out.println(ort+" puan alarak KALDINIZ");
        }



    }
}
