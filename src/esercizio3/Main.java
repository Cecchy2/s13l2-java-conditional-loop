package esercizio3;

import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Scrivi una parola o una frase, oppure :q per uscire");
            String str = scanner.nextLine();

            if(str.equals(":q")){
                break;
            }


            char[] result = str.toCharArray();
            System.out.println(Arrays.toString(result));

        }
        scanner.close();
    }
}