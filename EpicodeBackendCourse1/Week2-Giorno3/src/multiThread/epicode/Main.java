package multiThread.epicode;


public class Main {
	  public static void main(String[] args) {
	    ThreadSymbol t1 = new ThreadSymbol("*");
	    ThreadSymbol t2 = new ThreadSymbol("#");
	    t1.start();
	    t2.start();
	  }
	}