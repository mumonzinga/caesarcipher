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
        String quitter = myScanner.nextLine();
        if(request.equalsIgnoreCase("encrypt")) {
            System.out.println("To the Right or to the Left?");
                 request = myScanner.nextLine();
            if(request.equalsIgnoreCase("right")) {
                System.out.println("Enter text to Encrypt");
                String encodedRightText = myScanner.nextLine();
                System.out.println("Enter your approved Latch Key");
                int latchKey = myScanner.nextInt();

                CaesarCipher encryptT = new CaesarCipher("Z", "B", "A", 1, 1);

                String encodedRightScript = encryptT.getEncodedRightText();
                System.out.println("Here is your Encrypted/encoded script to the Right");
                System.out.println(encodedRightScript);
                System.out.println("-------------------------------------------");

            } else if (request.equalsIgnoreCase("left")) {
                System.out.println("Enter text to Encrypt");
                String encodedLeftText = myScanner.nextLine();
                System.out.println("Enter your approved Latch Key");
                int latchKey = myScanner.nextInt();

                CaesarCipher encryptL = new CaesarCipher("C", "I", "F", 3, 3);

                String encodedLeftScript = encryptL.getEncodedLeftText();
                System.out.println("Here is your Encrypted/encoded script to the Left");
                System.out.println(encodedLeftScript);
                System.out.println("-------------------------------------------");
            }
        }
        else if(request.equalsIgnoreCase("decrypt")) {
            System.out.println("To the Right or to the Left?");
            request = myScanner.nextLine();
            if(request.equalsIgnoreCase("right")) {
                System.out.println("Enter text to Decrypt");
                String decodedText = myScanner.nextLine();
                System.out.println("Enter your approved Key");
                int approvedKey = myScanner.nextInt();

                CaesarCipher decryptT = new CaesarCipher("Z", "B", "A", 1, 1);

                String decodedScript = "";
                decodedScript = decryptT.getDecodedText();
                System.out.println("Here is your Decrypted/decoded script to the Right");
                System.out.println(decodedScript);
                System.out.println("Does it make sense, yes or no?");
                request = myScanner.nextLine();
                if (request.equalsIgnoreCase("yes")) {
                    System.out.println("Do you want to quit?");
                    request = myScanner.nextLine();
                    if (request.equalsIgnoreCase("yes")) {
                        System.out.println("Ending the application ...");
                        System.out.println(decodedScript);
                        System.exit(0);
                    } else {
                        System.out.println("Do you want to encrypt or decrypt");
                    }
                } else if (request.equalsIgnoreCase("no")) {
                    System.out.println("Shifting to the left ...");
                    CaesarCipher decryptL = new CaesarCipher("Z", "B", "A", 1, 1);

                    decodedScript = decryptL.getDecodedText();
                    System.out.println("Here is your Decrypted/decoded script to the Left");

                    System.out.println(decodedScript);
                }
            }else if(request.equalsIgnoreCase("left")) {
                System.out.println("Enter text to Decrypt");
                String decodedText = myScanner.nextLine();
                System.out.println("Enter your approved Key");
                int approvedKey = myScanner.nextInt();

                CaesarCipher decryptL = new CaesarCipher("Z", "B", "A", 1, 1);

                 String decodedScript = decryptL.getDecodedText();
                System.out.println("Here is your Decrypted/decoded script to the Left");
                System.out.println(decodedScript);
                System.out.println("Does it make sense, yes or no?");
                request = myScanner.nextLine();
                if (request.equalsIgnoreCase("yes")) {
                    System.out.println("Do you want to quit?");
                    request =myScanner.nextLine();
                    if (request.equalsIgnoreCase("yes")) {
                        System.out.println("Ending the application ...");
                        System.exit(0);
                    } else {
                        System.out.println("Do you want to encrypt or decrypt");
                    }
                } else if (request.equalsIgnoreCase("no")) {
                    System.out.println("Shifting to the right ...");
                    CaesarCipher decryptT = new CaesarCipher("Z", "B", "A", 1, 1);

                    decodedScript = decryptT.getDecodedText();
                    System.out.println(decodedScript);
                    System.out.println("-------------------------------------------");
                }
            }
        } else  if (request.equalsIgnoreCase("quit")) {
            System.out.println("Ending the application ... ");
            System.exit(0);
        } else {
            System.out.println("Invalid request, please choose encrypt or decrypt");
        }
    }
}


