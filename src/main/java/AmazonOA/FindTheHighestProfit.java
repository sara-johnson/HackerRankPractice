package AmazonOA;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindTheHighestProfit {

    public static int findProfit(int numSuppliers, List<Integer> inventory, int order) {

        int totalProfit = 0;

        Collections.sort(inventory);
        Collections.reverse(inventory);

        System.out.println(inventory);

        PriorityQueue<Integer> profits = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer i1 , Integer i2) {
                if (i1 > i2) return -1;
                return 1;
            }
        });
        for (int i = 0; i < numSuppliers; i++) {
            int size = inventory.get(i);
            for (int j = 0; j < inventory.get(i); j++) {
                profits.add(size);
                size--;
            }
        }

        while (!profits.isEmpty() && order > 0) {
            totalProfit += profits.remove();
            order--;
        }

        return totalProfit;
    }
}
