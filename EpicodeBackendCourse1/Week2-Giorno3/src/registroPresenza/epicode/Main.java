package registroPresenza.epicode;

import java.io.IOException;

import org.apache.commons.io.PresenceRegister;

public class Main {
	  public static void main(String[] args) throws IOException {
	    PresenceRegister register = new PresenceRegister();
	    register.addPresence(new Presence("Mario Rossi", 5));
	    register.addPresence(new Presence("Giorgio Bianchi", 7));
	    register.addPresence(new Presence("Gianni Verdi", 7));
	    register.saveToFile("presences.txt");

	    PresenceRegister readRegister = new PresenceRegister();
	    readRegister.readFromFile("presences.txt");
	    System.out.println("Presences read from file:");
	    for (Presence presence : readRegister.getPresences()) {
	      System.out.println(presence.getName() + ": " + presence.getDays());
	    }
	  }
	}