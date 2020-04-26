import java.lang.*;
import java.util.Scanner;
import java.lang.String;

import java.util.ArrayList;
import java.util.List;
import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("╔╗╔╦═╦═╦═╦╦╗ ╔╦╦╦═╦═╦╦╦═╦═╦═╗\n" +
                "║╚╝║║║║║║║║║ ║║║║═╣═╣╔╣═╣║║║║\n" +
                "║╔╗║╦║╔╣╔╣╗║ ║║║║═╣═╣╚╣═╣║║║║\n" +
                "╚╝╚╩╩╩╩╩╝╚═╝ ╚══╩═╩═╩╩╩═╩╩╩═╝\n"
        );
        System.out.println(" ");
        System.out.println("\n" +
                " ברוך הבא ליישום הצופן קיסר שלי\n" +
                "welcome to my Caesar Cipher application \n" +
                "~amharic~ \n");

        System.out.println(" ");
        System.out.println("Do you want to encrypt, decrypt or quit?");
        String request = myScanner.nextLine();

        if(request.equalsIgnoreCase("encrypt")) {
            System.out.println("To the Right or to the Left?");
            if(request.equalsIgnoreCase("right")) {
                System.out.println("Enter text to Encrypt");
                String encodedRightText = myScanner.nextLine();
                System.out.println("Enter your approved Latch Key");
                int latchKey = myScanner.nextInt();

                CaeserCipher encryptT = new CaeserCipher("B", "Z", "A", 1, 1);

                String encodedScript = encryptT.encryptRight(encodedRightText, latchKey);
                System.out.println("Here is your Encrypted/encoded script to the Right");
                System.out.println(encodedScript);
                System.out.println("-------------------------------------------");
            } else if (request.equalsIgnoreCase("left")) {


            }


        }
    }
}