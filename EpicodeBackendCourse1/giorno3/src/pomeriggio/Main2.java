package pomeriggio;

import pomeriggioScanner.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Inserisci una stringa (q per uscire): ");
            String input = ((Object) scan).nextLine();
            if (input.equals("q")) {
                break;
            }
            String[] chars = input.split("");
            System.out.print("I caratteri della stringa sono: ");
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i]);
                if (i < chars.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println("Programma terminato");
        scan.close();
    }
}
