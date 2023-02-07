package collection.java.epicode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = generateRandomList(10);
        System.out.println("Lista originale: " + list);

        List<Integer> newList = mergeLists(list);
        System.out.println("Nuova lista: " + newList);

        boolean isEven = true;
        System.out.println("Valori in posizioni " + (isEven ? "pari" : "dispari") + ": ");
        printListByPosition(newList, isEven);
    }

    private static List<Integer> generateRandomList(int n) {
        List<Integer> list = new ArrayList<>(n);
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(101));
        }
        Collections.sort(list);
        return list;
    }

    private static List<Integer> mergeLists(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list.size() * 2);
        newList.addAll(list);
        newList.addAll(reverseList(list));
        return newList;
    }

    private static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    private static void printListByPosition(List<Integer> list, boolean isEven) {
        int step = isEven ? 2 : 1;
        for (int i = 0; i < list.size(); i += step) {
            System.out.println(list.get(i));
        }
    }
}
