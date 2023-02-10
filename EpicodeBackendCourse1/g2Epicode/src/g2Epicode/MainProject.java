package g2Epicode;

import g2Epicode.Esercizio2.Rettangolo;

public class MainProject {

	public static void main(String[] args) {
		
		Rettangolo r1 = new Rettangolo (10, 5);
		stampaRettangolo(r1);

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
