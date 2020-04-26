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
                String encodedRightScript = myScanner.nextLine();
                System.out.println("Enter your approved Latch Key");
                int latchKey = myScanner.nextInt();

                CaeserCipher encryptT = new CaeserCipher("Z", "B", "A", 1, 1);

                String encodedRightText = encryptT.encryptRight(encodedRightScript, latchKey);
                System.out.println("Here is your Encrypted/encoded script to the Right");
                System.out.println(encodedRightText);
                System.out.println("-------------------------------------------");
            } else if (request.equalsIgnoreCase("left")) {
                System.out.println("Enter text to Encrypt");
                String encodedLeftScript = myScanner.nextLine();
                System.out.println("Enter your approved Latch Key");
                int latchKey = myScanner.nextInt();

                CaeserCipher encryptL = new CaeserCipher("C", "I", "F", 3, 3);

                String encodedLeftText = encryptL.encryptLeft(encodedLeftScript, latchKey);
                System.out.println("Here is your Encrypted/encoded script to the Left");
                System.out.println(encodedLeftText);
                System.out.println("-------------------------------------------");



            }


        }
        else if(request.equalsIgnoreCase("decrypt")) {
            String decodedText = "";
            System.out.println("To the Right or to the Left?");
            if(request.equalsIgnoreCase("right")) {
                System.out.println("Enter text to Decrypt");
                String decodedRightScript = myScanner.nextLine();
                System.out.println("Enter your approved Key");
                int approvedKey = myScanner.nextInt();

                CaeserCipher decryptT = new CaeserCipher("Z", "B", "A", 1, 1);

                decodedText = decryptT.decrypt(decodedRightScript, approvedKey);
                System.out.println("Here is your Decrypted/decoded script to the Right");
                System.out.println(decodedText);
                System.out.println("Does it make sense?\n");
                System.out.println("Yes or No");
                String answer = myScanner.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Do you want to quit?");
                    String quitter = myScanner.nextLine();
                    if (answer.equalsIgnoreCase("yes")) {
                        System.out.println("Ending the application ...");
                        System.exit(0);
                    } else {
                        System.out.println("Do you want to encrypt or decrypt");

                    }

                } else if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Shifting to the left ...");

                    decodedText = decryptT.decrypt(decodedRightScript, approvedKey);
                    System.out.println(decodedText);

                }
            } else if(request.equalsIgnoreCase("left")) {
                System.out.println("Enter text to Decrypt");
                String decodedLeftScript = myScanner.nextLine();
                System.out.println("Enter your approved Key");
                int approvedKey = myScanner.nextInt();

                CaeserCipher decryptL = new CaeserCipher("Z", "B", "A", 1, 1);

                decodedText = decryptL.decrypt(decodedLeftScript, approvedKey);
                System.out.println("Here is your Decrypted/decoded script to the Left");
                System.out.println(decodedText);
                System.out.println("Does it make sense?\n");
                System.out.println("Yes or No");
                String answer = myScanner.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Do you want to quit?");
                    String quitter = myScanner.nextLine();
                    if (answer.equalsIgnoreCase("yes")) {
                        System.out.println("Ending the application ...");
                        System.exit(0);
                    } else {
                        System.out.println("Do you want to encrypt or decrypt");

                    }

                } else if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Shifting to the right ...");

                    decodedText = decryptL.decrypt(decodedLeftScript, approvedKey);
                    System.out.println(decodedText);

                    System.out.println("-------------------------------------------");
                }



            }
        } else  if (request.equalsIgnoreCase("quit")) {
            System.out.println("Ending the application ... ");
            System.exit(0);

        }
    }
}