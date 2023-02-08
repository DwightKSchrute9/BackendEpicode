package arrayPartitionThread.epicode;

import java.util.Random;

public class Main {
	  public static void main(String[] args) throws InterruptedException {
	    int[] array = new int[3000];
	    Random random = new Random();
	    for (int i = 0; i < array.length; i++) {
	      array[i] = random.nextInt(100);
	    }

	    ArrayPartitionThread t1 = new ArrayPartitionThread(array, 0, 1000);
	    ArrayPartitionThread t2 = new ArrayPartitionThread(array, 1000, 2000);
	    ArrayPartitionThread t3 = new ArrayPartitionThread(array, 2000, 3000);
	    t1.start();
	    t2.start();
	    t3.start();
	    t1.join();
	    t2.join();
	    t3.join();

	    int totalResult = t1.getResult() + t2.getResult() + t3.getResult();
	    System.out.println("Total result: " + totalResult);
	  }
	}