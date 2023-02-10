package esercizio2;

import java.util.ArrayList;

import g2Epicode.EsercizioIIdi2.Chiamata;

public class cartaSIM {
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


}
