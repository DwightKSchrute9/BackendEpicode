package registroPresenza.epicode;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Presence {
  private String name;
  private int days;

  public Presence(String name, int days) {
    this.name = name;
    this.days = days;
  }


public String getName() {
    return name;
  }

  public int getDays() {
    return days;
  }

  @Override
  public String toString() {
    return name + "@" + days;
  }
}

