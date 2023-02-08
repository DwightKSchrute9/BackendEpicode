package arrayPartitionThread.epicode;

import java.util.Arrays;
import java.util.Random;

class ArrayPartitionThread extends Thread {
  private int[] array;
  private int startIndex;
  private int endIndex;
  private int result;

  public ArrayPartitionThread(int[] array, int startIndex, int endIndex) {
    this.array = array;
    this.startIndex = startIndex;
    this.endIndex = endIndex;
  }

  @Override
  public void run() {
    for (int i = startIndex; i < endIndex; i++) {
      result += array[i];
    }
  }

  public int getResult() {
    return result;
  }
}
