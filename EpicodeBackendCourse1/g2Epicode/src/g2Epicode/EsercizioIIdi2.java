package g2Epicode;
import java.util.ArrayList;

public class EsercizioIIdi2 {


	public class Chiamata {
	  private int durata;
	  private String numeroChiamato;

	  public Chiamata(int durata, String numeroChiamato) {
	    this.durata = durata;
	    this.numeroChiamato = numeroChiamato;
	  }

	  public int getDurata() {
	    return durata;
	  }

	  public String getNumeroChiamato() {
	    return numeroChiamato;
	  }
	}

	public class SIM {
	  private String numeroTelefono;
	  private double creditoDisponibile;
	  private ArrayList<Chiamata> chiamateEffettuate;

	  public SIM(String numeroTelefono) {
	    this.numeroTelefono = numeroTelefono;
	    this.creditoDisponibile = 0.0;
	    this.chiamateEffettuate = new ArrayList<Chiamata>();
	  }

	  public String getNumeroTelefono() {
	    return numeroTelefono;
	  }

	  public double getCreditoDisponibile() {
	    return creditoDisponibile;
	  }

	  public ArrayList<Chiamata> getChiamateEffettuate() {
	    return chiamateEffettuate;
	  }

	  public void stampaDatiSIM() {
	    System.out.println("Numero telefono: " + numeroTelefono);
	    System.out.println("Credito disponibile: " + creditoDisponibile + " euro");
	    System.out.println("Ultime 5 chiamate effettuate:");
	    int numeroChiamate = chiamateEffettuate.size();
	    if (numeroChiamate == 0) {
	      System.out.println("Nessuna chiamata effettuata");
	    } else {
	      int numeroChiamateDaStampare = Math.min(numeroChiamate, 5);
	      for (int i = 0; i < numeroChiamateDaStampare; i++) {
	        Chiamata chiamata = chiamateEffettuate.get(i);
	        System.out.println("Chiamata " + (i + 1) + ": durata " + chiamata.getDurata() + " minuti, numero chiamato " + chiamata.getNumeroChiamato());
	      }
	    }
	  }
	}

	public class Main {
	  public static void main(String[] args) {
	    SIM sim = new SIM("333333533");
	    sim.stampaDatiSIM();
	  }
	}

}
