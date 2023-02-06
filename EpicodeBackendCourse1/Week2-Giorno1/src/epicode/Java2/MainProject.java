package epicode.Java2;

import java.util.Scanner;
import java.util.Random;

public class MainProject {
  public static void main(String[] args) {
    int[] array = new int[5];
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    // Istanzia l'array con valori casuali da 1 a 10
    for (int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt(10) + 1;
    }

    // Stampa l'array originale
    System.out.print("Array originale: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();

    // Chiede all'utente di inserire un valore in una posizione specifica
    int pos, value;
    do {
      System.out.print("Inserisci la posizione (0 per uscire): ");
      pos = sc.nextInt();
      if (pos == 0) {
        break;
      }
      System.out.print("Inserisci il valore: ");
      value = sc.nextInt();
      try {
        array[pos - 1] = value;
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Posizione non valida. Riprova.");
        continue;
      }
      // Stampa l'array modificato
      System.out.print("Array modificato: ");
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    } while (pos != 0);
  }
}
