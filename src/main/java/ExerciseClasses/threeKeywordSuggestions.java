package ExerciseClasses;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class threeKeywordSuggestions {

    public List<List<String>> keyWordSuggestions(int numReviews,
                                                 List<String> repository,
                                                 String customerQuery) {

        Collections.sort(repository);
        List<String> loweredRepo = new ArrayList<>();
        for (String w : repository) {
            loweredRepo.add(w.toLowerCase());
        }
        customerQuery.toLowerCase();


        List<String> individualKeyWordResults;
        List<List<String>> totalKeyWordResults = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < customerQuery.length(); i++) {
            sb.append(customerQuery.charAt(i));
            System.out.println("typing:" + sb.toString());
            if (i >= 1) {
                individualKeyWordResults = new ArrayList<>();
                for (String word : loweredRepo) {
                    System.out.println("Word in repo:" + word);
                    if ((sb.toString()).equals(word.substring(0, i + 1))) {
                        System.out.println("Word added: " + word);
                        individualKeyWordResults.add(word);
                    }

                    System.out.println("-----");
                    System.out.println("individual list: " + individualKeyWordResults);
                    System.out.println("-----");
                }


                System.out.println("unsorted: " + individualKeyWordResults);
                Collections.sort(individualKeyWordResults);
                System.out.println("sorted: " + individualKeyWordResults);
                List<String> cutKWList = new ArrayList<>();
                if (individualKeyWordResults.size() > 3) {
                    cutKWList = new ArrayList<>();
                    cutKWList.add(individualKeyWordResults.get(0));
                    cutKWList.add(individualKeyWordResults.get(1));
                    cutKWList.add(individualKeyWordResults.get(2));
                    totalKeyWordResults.add(cutKWList);
                    System.out.println("total kw results: " + totalKeyWordResults);
                } else {
                    totalKeyWordResults.addAll(Collections.singleton(individualKeyWordResults));
                    System.out.println("total kw results: " + totalKeyWordResults);
                }

            }
        }
        //System.out.println(totalKeyWordResults);
        if (totalKeyWordResults.isEmpty()) {
            return new ArrayList<>();
        }
        return totalKeyWordResults;
    }
}
