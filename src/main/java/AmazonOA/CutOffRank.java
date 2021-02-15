package AmazonOA;

import java.util.Collections;
import java.util.List;

public class CutOffRank {

    public static int cutOffRank(int cutOff, int num, List<Integer> scores) {

        Collections.sort(scores);
        Collections.reverse(scores);

        System.out.println(scores);

        int playersAboveCutoffRank = 0;
        int currentRank = 1;
        int currentScore = 0;

        for (int i = 0; i < num; i++) {

            if (playersAboveCutoffRank > cutOff) {
                return playersAboveCutoffRank;
            }
                if (i == 0) {
                    currentScore = scores.get(i);
                    playersAboveCutoffRank++;
                    System.out.println("Current Iteration: " + i);
                    System.out.println("Current Score: " + currentScore);
                    System.out.println("Current Rank: " + currentRank);
                    System.out.println("Players Above Cutoff Rank: " + playersAboveCutoffRank);
                }
                if (i > 0 && scores.get(i) == currentScore) {
                    playersAboveCutoffRank++;

                } else if(i > 0) {
                    currentScore = scores.get(i);
                    playersAboveCutoffRank++;
                    currentRank++;

                }
        }
        return playersAboveCutoffRank;
    }

}
