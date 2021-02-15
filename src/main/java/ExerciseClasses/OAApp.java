package ExerciseClasses;

import AmazonOA.CutOffRank;
import AmazonOA.FindTheHighestProfit;
import AmazonOA.MaxDiskSpace;

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
        System.out.println();

        System.out.println("Problem: Max Disk Space");
        int numComputer1 = 3;
        List<Integer> hardDiskSpace1 = new ArrayList<>();
        hardDiskSpace1.add(8);
        hardDiskSpace1.add(2);
        hardDiskSpace1.add(4);
        int segmentLength1 = 2; //answer is 2

        int numComputer2 = 10;
        List<Integer> hardDiskSpace2 = new ArrayList<>();
        hardDiskSpace2.add(8);
        hardDiskSpace2.add(2);
        hardDiskSpace2.add(7);
        hardDiskSpace2.add(4);
        hardDiskSpace2.add(5);
        hardDiskSpace2.add(4);
        hardDiskSpace2.add(9);
        hardDiskSpace2.add(4);
        hardDiskSpace2.add(6);
        hardDiskSpace2.add(3);
        int segmentLength2 = 3;  //answer is 4

        MaxDiskSpace maxDiskSpace = new MaxDiskSpace();
        System.out.println(maxDiskSpace.available_space(numComputer2, hardDiskSpace2, segmentLength2));
        System.out.println();
        System.out.println();

        System.out.println("Problem: Cut Off Rank");
        int cutOff1 = 3;
        int num1 = 4;
        List<Integer> scores1 = new ArrayList<>();
        scores1.add(100);
        scores1.add(50);
        scores1.add(50);
        scores1.add(25);

        int cutOff2 = 4;
        int num2 = 5;
        List<Integer> scores2 = new ArrayList<>();
        scores2.add(2);
        scores2.add(2);
        scores2.add(3);
        scores2.add(4);
        scores2.add(5);

        System.out.println(CutOffRank.cutOffRank(cutOff2, num2, scores2));

    }

}
