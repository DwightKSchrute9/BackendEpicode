package pomeriggio;


public class mainProject {
	  public static void main(String[] args) {
  	// dichiarazione variabili
		    String str = "Hello World";
    		    int year = 2023;
       // stampa a schermo dei risultati dei metodi
    		    System.out.println("La stringa " + str + " è pari?");
		    System.out.println(isEven(str));
    		    System.out.println("");
    		    System.out.println("L'anno " + year +" è bisestile?");
    		    System.out.println(isBisestile(year));
		  }
  		
   // metodo isEven()
       public static boolean isEven(String str) {
		if ((str.length() % 2) == 0) {
			return true;
		} else {
			return false;
		}
        }
  // metodo isBisestile()      
	 public static boolean isBisestile(int year) {
  if (year % 4 != 0) {
    return false;
  } else if (year % 400 == 0) {
    return true;
  } else if (year % 100 == 0) {
    return false;
  } else {
    return true;
  }
}
}
