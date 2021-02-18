package ExerciseClasses;

import AmazonOA.CutOffRank;
import AmazonOA.FindTheHighestProfit;
import AmazonOA.MaxDiskSpace;
import AmazonOA.NearestCities;

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
        scores1.add(25); //Answer 3

        int cutOff2 = 4;
        int num2 = 5;
        List<Integer> scores2 = new ArrayList<>();
        scores2.add(2);
        scores2.add(2);
        scores2.add(3);
        scores2.add(4);
        scores2.add(5);  //Answer 5

        System.out.println(CutOffRank.cutOffRank(cutOff1, num1, scores1));
        System.out.println();
        System.out.println();

        System.out.println("Problem: Nearest Cities");
        int numOfCities1 = 3;
        List<String> cities1 = new ArrayList<>();
        cities1.add("c1");
        cities1.add("c2");
        cities1.add("c3");
        List<Integer> xCoord1 = new ArrayList<>();
        xCoord1.add(3);
        xCoord1.add(2);
        xCoord1.add(1);
        List<Integer> yCoord1 = new ArrayList<>();
        yCoord1.add(3);
        yCoord1.add(2);
        yCoord1.add(3);
        int numbOfQueries1 = 3;
        List<String> queries1 = new ArrayList<>();
        queries1.add("c1");
        queries1.add("c2");
        queries1.add("c3");

        int numOfCities2 = 5;
        List<String> cities2 = new ArrayList<>();
        cities2.add("green");
        cities2.add("red");
        cities2.add("blue");
        cities2.add("yellow");
        cities2.add("green");
        List<Integer> xCoord2 = new ArrayList<>();
        xCoord2.add(100);
        xCoord2.add(200);
        xCoord2.add(300);
        xCoord2.add(400);
        xCoord2.add(500);
        List<Integer> yCoord2 = new ArrayList<>();
        yCoord2.add(100);
        yCoord2.add(200);
        yCoord2.add(300);
        yCoord2.add(400);
        yCoord2.add(500);
        int numbOfQueries2 = 5;
        List<String> queries2 = new ArrayList<>();
        queries2.add("green");
        queries2.add("red");
        queries2.add("blue");
        queries2.add("yellow");
        queries2.add("green");

        System.out.println(NearestCities.nearestCities(numOfCities2, cities2, xCoord2, yCoord2, numbOfQueries2, queries2));
    }

}
