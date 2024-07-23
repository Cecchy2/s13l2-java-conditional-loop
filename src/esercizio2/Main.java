package esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Scegli un numero da 0 a 3");
        int numIntero = Integer.parseInt((scanner.nextLine()));


        switch (numIntero) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;

            default:
                System.out.println("Hai sbagliato, volevo un numero da 1 a 3");

        }

        scanner.close();






    }
}