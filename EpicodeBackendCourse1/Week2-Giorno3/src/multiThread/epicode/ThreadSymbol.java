package multiThread.epicode;

class ThreadSymbol extends Thread {
	  private String symbol;

	  public ThreadSymbol(String symbol) {
	    this.symbol = symbol;
	  }

	  @Override
	  public void run() {
	    for (int i = 0; i < 10; i++) {
	      System.out.println(symbol);
	      try {
	        Thread.sleep(1000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }
	  }
	}