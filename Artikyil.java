import java.util.Scanner;

public class Artikyil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl girin: ");
        int yil = input.nextInt();
        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.print("Artık yıl.");
            }
            else{
                System.out.print("Artık yıl değil.");
            }
        }
        else{
            if (yil%4==0){
                System.out.print("Artık yıl.");
            }
            else {
                System.out.print("Artık yıl değil.");
            }
        }

    }
}
