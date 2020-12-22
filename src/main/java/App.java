import ExerciseClasses.KeywordSuggestions;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String[] myProducts = new String[]{"bags","baggage","banner","box","cloths"};
        String myWord = "bags";

        String[] myProducts2 = new String[]{"mobile","mouse","moneypot","monitor","mousepad"};
        String myWord2 = "mouse";



        KeywordSuggestions suggestions = new KeywordSuggestions();
        System.out.println(suggestions.suggestedProducts(myProducts2, myWord2));



    }
}
