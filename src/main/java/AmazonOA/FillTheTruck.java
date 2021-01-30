package AmazonOA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillTheTruck {

    public int unitsToFillTheTruck(int numOfProducts, List<Integer> boxes, int unitSize,
                                   List<Integer> unitsPerBox, int truckSize) {


        List<Integer> maxUnitsCarried = new ArrayList<>();

        //for each product, add the number of units for each number of boxes to the list.
        for (int i = 0; i < boxes.size(); i++) {
            for (int j = 0; j < boxes.get(i); j++) {
                maxUnitsCarried.add(unitsPerBox.get(i));
            }
        }

        Collections.sort(maxUnitsCarried, Collections.reverseOrder());

        int totalUnits = 0;
        int counter = 0;
        while(counter < truckSize) {
            totalUnits += maxUnitsCarried.get(counter);
            counter++;
        }

        return totalUnits;
    }

}
