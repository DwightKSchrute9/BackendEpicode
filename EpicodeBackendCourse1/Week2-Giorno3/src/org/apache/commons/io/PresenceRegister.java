package org.apache.commons.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import registroPresenza.epicode.Presence;


public class PresenceRegister {
	  private List<Presence> presences = new ArrayList<>();

	  public void addPresence(Presence presence) {
	    presences.add(presence);
	  }

	  public List<Presence> getPresences() {
	    return presences;
	  }

	  public void saveToFile(String fileName) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    for (Presence presence : presences) {
	      sb.append(presence.toString()).append("#");
	    }
	    FileUtils.writeStringToFile(new File(fileName), sb.toString(), "UTF-8");
	  }

	  public void readFromFile(String fileName) throws IOException {
	    String fileContent = FileUtils.readFileToString(new File(fileName), "UTF-8");
	    String[] presencesAsString = fileContent.split("#");
	    for (String presenceAsString : presencesAsString) {
	      String[] presenceData = presenceAsString.split("@");
	      presences.add(new Presence(presenceData[0], Integer.parseInt(presenceData[1])));
	    }
	  }
	}

