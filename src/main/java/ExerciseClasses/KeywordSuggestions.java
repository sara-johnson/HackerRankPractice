package ExerciseClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an array of strings products and a string searchWord. We want to design a system that suggests
 * at most three product names from products after each character of searchWord is typed. Suggested products
 * should have common prefix with the searchWord. If there are more than three products with a common prefix
 * return the three lexicographically minimums products.
 *
 * Return list of lists of the suggested products after each character of searchWord is typed.
 * https://leetcode.com/problems/search-suggestions-system/
 */
public class KeywordSuggestions {

    public KeywordSuggestions() {
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        List<String> myProducts = new ArrayList<>();
        for (String product : products) {
            myProducts.add(product);
        }

        Collections.sort(myProducts);

        List<List<String>> returnList = new ArrayList<>();
        String letters = "";

        for (int i = 0; i < searchWord.length(); i++) {
            List<String> subReturnList = new ArrayList<>();

            letters += String.valueOf(searchWord.charAt(i));

            for (int j = 0; j < myProducts.size(); j++) {
                if (myProducts.get(j).startsWith(letters)) {
                    subReturnList.add(myProducts.get(j));
                } else {
                    continue;
                }
                if (subReturnList.size() >= 3) {
                    break;
                }
            }
            returnList.add(subReturnList);
        }
        return returnList;
    }

}

