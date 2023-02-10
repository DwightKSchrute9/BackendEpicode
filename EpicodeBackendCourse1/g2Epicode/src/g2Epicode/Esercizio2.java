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
		 
	}
}

