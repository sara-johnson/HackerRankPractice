package ExerciseClasses;

import AmazonOA.FindTheHighestProfit;

import java.util.ArrayList;
import java.util.List;

public class OAApp {
    public static void main(String[] args) {
        System.out.println("LeetCode Practice:");
        System.out.println();

        System.out.println("Problem: Find The Highest Profit");
        int numSuppliers1 = 5;
        List<Integer> inventory1 = new ArrayList<>();
        inventory1.add(2);
        inventory1.add(8);
        inventory1.add(4);
        inventory1.add(10);
        inventory1.add(6);
        int order1 = 20;

        System.out.println(FindTheHighestProfit.findProfit(numSuppliers1, inventory1, order1));
        System.out.println();
    }

}
