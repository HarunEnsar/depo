import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("username:");
        String username = input.nextLine();
        System.out.print("Password:");
        String password = input.nextLine();

        if (username.equals("harun") && password.equals("harun123")) {
            System.out.println("LOGİN SUCCESS");
        } else {
            System.out.println("Username or Password is wrong!");
            System.out.println("İf you forgat password,write y ");
            String forgot = input.nextLine();
            if (forgot.equals("y")) {
                System.out.print("Usarname:");
                String nUsername = input.nextLine();
                if (nUsername.equals("harun")) {
                    System.out.println("New password:");
                    String nPassword = input.nextLine();
                    if (nPassword.equals("harun123")) {
                        System.out.println("The new password cannot be the same as the old password.");
                    } else{
                        System.out.println("Password changed successfully");
                        /*System.out.print("username:");
                        String userName = input.nextLine();
                        System.out.print("Password:");
                        String npassword = input.nextLine();

                        if (userName==username && npassword==nPassword ) {
                            System.out.println("LOGİN SUCCESS");
                        } else {
                            System.out.println("Username or Password is wrong!");
                        }*/


                    }
                }
                else{
                    System.out.println("Username is wrong!");
                }

            }
        }
    }
}

