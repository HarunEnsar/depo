import java.util.Scanner;

public class Odev42 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int taban,us;
        System.out.print("Üssü alınacak sayıyı girin: ");
        taban= input.nextInt();
        System.out.print("Üs olacak sayıyı girin: ");
        us= input.nextByte();
        //3^4=3*3*3*3;
        int sonuc=1;
        for(int i=1;i<=us;i++){
            sonuc=sonuc*taban;
        }
            System.out.println(sonuc);

    }
}
