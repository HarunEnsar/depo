import java.util.Scanner;

public class Zodyak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı girin: ");
        int yil = input.nextInt();
        int zodyak = yil % 12;
        if (yil > 0) {
            switch (zodyak) {
                case 0:
                    System.out.print("MAYMUN");
                    break;
                case 1:
                    System.out.print("HOROZ");
                    break;
                case 2:
                    System.out.print("KÖPEK");
                    break;
                case 3:
                    System.out.print("DOMUZ");
                    break;
                case 4:
                    System.out.print("FARE");
                    break;
                case 5:
                    System.out.print("ÖKÜZ");
                    break;
                case 6:
                    System.out.print("KAPLAN");
                    break;
                case 7:
                    System.out.print("TAVŞAN");
                    break;
                case 8:
                    System.out.print("EJDERHA");
                    break;
                case 9:
                    System.out.print("YILAN");
                    break;
                case 10:
                    System.out.print("AT");
                    break;
                case 11:
                    System.out.print("KOYUN");
                    break;
            }
        }
        else{
         System.out.print("Hatalı giriş!");
        }


    }
}
