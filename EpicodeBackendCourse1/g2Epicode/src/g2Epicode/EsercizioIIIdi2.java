package g2Epicode;

public class EsercizioIIIdi2 {
	public class Articolo {
		  private int codiceArticolo;
		  private String descrizioneArticolo;
		  private double prezzo;
		  private int numeroPezziDisponibili;

		  public Articolo(int codiceArticolo, String descrizioneArticolo, double prezzo, int numeroPezziDisponibili) {
		    this.codiceArticolo = codiceArticolo;
		    this.descrizioneArticolo = descrizioneArticolo;
		    this.prezzo = prezzo;
		    this.numeroPezziDisponibili = numeroPezziDisponibili;
		  }

		  public int getCodiceArticolo() {
		    return codiceArticolo;
		  }

		  public String getDescrizioneArticolo() {
		    return descrizioneArticolo;
		  }

		  public double getPrezzo() {
		    return prezzo;
		  }

		  public int getNumeroPezziDisponibili() {
		    return numeroPezziDisponibili;
		  }
		}

		public class Cliente {
		  private int codiceCliente;
		  private String nome;
		  private String cognome;
		  private String email;
		  private LocalDate dataIscrizione;

		  public Cliente(int codiceCliente, String nome, String cognome, String email, LocalDate dataIscrizione) {
		    this.codiceCliente = codiceCliente;
		    this.nome = nome;
		    this.cognome = cognome;
		    this.email = email;
		    this.dataIscrizione = dataIscrizione;
		  }

		  public int getCodiceCliente() {
		    return codiceCliente;
		  }

		  public String getNome() {
		    return nome;
		  }

		  public String getCognome() {
		    return cognome;
		  }

		  public String getEmail() {
		    return email;
		  }

		  public LocalDate getDataIscrizione() {
		    return dataIscrizione;
		  }
		}

		public class Carrello {
		  private Cliente cliente;
		  private List<Articolo> articoli;

		  public Carrello(Cliente cliente) {
		    this.cliente = cliente;
		    this.articoli = new ArrayList<Articolo>();
		  }

		  public void addArticolo(Articolo articolo) {
		    articoli.add(articolo);
		  }

		  public double getTotaleCostoArticoli() {
		    double totale = 0;
		    for (Articolo articolo : articoli) {
		      totale += articolo.getPrezzo();
		    }
		    return totale;
		  }

		  public Cliente getCliente() {
		    return cliente;
		  }

		  public List<Articolo> getArticoli() {
		    return articoli;
		  }
		}

		public class Ecommerce {
		  public static void main(String[] args) {
		    Cliente cliente = new Cliente(1, "John", "Doe", "johndoe@example.com", LocalDate.now());


}
