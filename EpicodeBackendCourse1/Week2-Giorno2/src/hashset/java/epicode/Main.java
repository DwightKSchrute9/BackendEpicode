package hashset.java.epicode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero di parole da inserire: ");
        int n = scanner.nextInt();

        Set<String> words = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci una parola: ");
            String word = scanner.next();

            if (!words.add(word)) {
                duplicateWords.add(word);
            }
        }

        System.out.println("Parole duplicate: " + duplicateWords);
        System.out.println("Numero di parole distinte: " + words.size());
        System.out.println("Elenco di parole distinte: " + words);
    }
}
