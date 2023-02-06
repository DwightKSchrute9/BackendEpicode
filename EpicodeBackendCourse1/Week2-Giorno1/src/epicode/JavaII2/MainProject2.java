package epicode.JavaII2;


import java.util.Scanner;

public class MainProject2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double km, litri, kmPerLitro;

    System.out.print("Inserisci i km percorsi: ");
    km = sc.nextDouble();
    System.out.print("Inserisci i litri di carburante consumati: ");
    litri = sc.nextDouble();

    try {
      kmPerLitro = km / litri;
    } catch (ArithmeticException e) {
      System.out.println("Errore: divisione per 0");
      return;
    }

    System.out.println("Km per litro: " + kmPerLitro);
  }
}
