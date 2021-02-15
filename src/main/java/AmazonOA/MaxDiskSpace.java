package AmazonOA;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MaxDiskSpace {

    public int available_space(int numComputer, List<Integer> hardDiskSpace, int segmentLength) {

        int startIndex = 0;
        int endIndex = startIndex + segmentLength;

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (o1 < o2) {
                    return 1;
                }
                if (o1 > o2) {
                    return -1;
                }
                return 0;
                //return o2.compareTo(o1); <same as above if statements>

            }
        });

        List<Integer> subArray;

        //loop through the entire array

        while (startIndex < endIndex && endIndex < numComputer) {
            int min = Integer.MAX_VALUE;
            subArray = hardDiskSpace.subList(startIndex, endIndex);

            for (Integer hd : subArray) {
                if (hd < min) {
                    min = hd;
                }
            }
            System.out.println("Min: " + min);
            pq.add(min);
            startIndex++;
            endIndex++;
        }

        return pq.remove();
    }
}
