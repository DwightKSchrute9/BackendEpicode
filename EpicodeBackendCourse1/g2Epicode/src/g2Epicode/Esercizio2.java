/**
 * 
 */
package g2Epicode;

/**
 * @author Utente
 *
 */
public class Esercizio2 {
	
	
	public class Rettangolo {
		  private int altezza;
		  private int larghezza;

		  public Rettangolo(int altezza, int larghezza) {
		    this.altezza = altezza;
		    this.larghezza = larghezza;
		  }

		  public int getAltezza() {
		    return altezza;
		  }

		  public int getLarghezza() {
		    return larghezza;
		  }

		  public int calcolaPerimetro() {
		    return 2 * (altezza + larghezza);
		  }

		  public int calcolaArea() {
		    return altezza * larghezza;
		  }
		  public void stampaRettangolo() {
			    System.out.println("Area: " + calcolaArea());
			    System.out.println("Perimetro: " + calcolaPerimetro());
		}
		  public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
			    System.out.println("Rettangolo 1:");
			    r1.stampaRettangolo();
			    System.out.println("Rettangolo 2:");
			    r2.stampaRettangolo();
			    System.out.println("Somma aree: " + (r1.calcolaArea() + r2.calcolaArea()));
			    System.out.println("Somma perimetri: " + (r1.calcolaPerimetro() + r2.calcolaPerimetro()));
		  }
	}
}

