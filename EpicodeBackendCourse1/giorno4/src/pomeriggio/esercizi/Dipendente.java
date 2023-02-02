package pomeriggio.esercizi;

public class Dipendente {
	
    public static final double stipendioBase = 1000;
    
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;
    
    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }
    
    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, 
                     Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }
    
    public String getMatricola() {
        return matricola;
    }
    
    public double getStipendio() {
        return stipendio;
    }
    
    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }
    
    public Livello getLivello() {
        return livello;
    }
    
    public Dipartimento getDipartimento() {
        return dipartimento;
    }
    
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
    
    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }
    

    public Livello promuovi() {
        switch (livello) {
            case OPERAIO:
                stipendio = stipendioBase * 1.2;
                livello = Livello.IMPIEGATO;
                break;
            case IMPIEGATO:
                stipendio = stipendioBase * 1.5;
                livello = Livello.QUADRO;
                break;
            case DIRIGENTE:
            	stipendio = stipendioBase *2;
            	livello = Livello.DIRIGENTE;
            	break;
		case QUADRO:
			stipendio = stipendioBase * 1.5;
			livello = Livello.QUADRO;
			break;
		default:
			break;
            	
            	
        }
    }
}



