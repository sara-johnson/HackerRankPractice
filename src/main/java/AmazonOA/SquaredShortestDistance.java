package AmazonOA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SquaredShortestDistance {

    public static int shortestDistance(int numRobots, int[] positionX, int[] positionY) {
        List<Integer> listDistance = new ArrayList<>();

        for (int i = 0; i < numRobots - 1; i++) {
            for (int j = 1; j < numRobots; j++) {
                listDistance.add(distance(positionX[i], positionX[j], positionY[i], positionY[j]));
            }
        }

        Collections.sort(listDistance);
        int index = 0;
        while (listDistance.get(index) == 0) {
            index++;
        }
        return listDistance.get(index);
    }

    private static int distance(int x1, int x2, int y1, int y2) {
        return ((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }


}
