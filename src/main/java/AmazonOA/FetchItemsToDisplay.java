package AmazonOA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FetchItemsToDisplay {

    public List<String> fetchItems(int sortParam, int sortOrder, int itemsPerPage,
                                   int pageNumber, int numOfItems, HashMap<String, TwoInts> items) {


        Comparator<Map.Entry<String, TwoInts>> compareItems = new Comparator<Map.Entry<String, TwoInts>>() {
            int order = sortOrder == 0 ? 1 : -1;
            public int compare(Map.Entry<String, TwoInts> o1, Map.Entry<String, TwoInts> o2) {
                if (sortParam == 0) {
                    return o1.getKey().compareTo(o2.getKey()) * order;
                } else if (sortParam == 1) {
                    return Integer.compare(o1.getValue().relevance, o2.getValue().relevance) * order;
                } else {
                    return Integer.compare(o1.getValue().price, o2.getValue().price) * order;
                }
            }
        };

        List<Map.Entry<String, TwoInts>> sortedList = new ArrayList<>(items.entrySet());
        sortedList.sort(compareItems);

        int startItem = pageNumber * itemsPerPage;
        int endItem = startItem + itemsPerPage;

        List<String> finalList = new ArrayList<>();
        for (int i = startItem; i < endItem - 1; i++) {
            finalList.add(sortedList.get(i).getKey());
        }
        return finalList;
    }

    public static class TwoInts {
        int relevance;
        int price;

        public TwoInts(int relevance, int price) {
            this.relevance = relevance;
            this.price = price;
        }
    }


}
