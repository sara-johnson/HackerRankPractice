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
        int countOfMultipleSameScores = 0;

        for (int i = 0; i < num; i++) {

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
                    countOfMultipleSameScores++;
                    if (checkIfCutOffRankExceeded(currentRank, cutOff)) {
                        return playersAboveCutoffRank;
                    }
                    System.out.println("Current Iteration: " + i);
                    System.out.println("Current Score: " + currentScore);
                    System.out.println("Current Rank: " + currentRank);
                    System.out.println("Players Above Cutoff Rank: " + playersAboveCutoffRank);

                } else if(i > 0) {

                    if (playersAboveCutoffRank > currentRank) {
                        currentRank += countOfMultipleSameScores;
                        countOfMultipleSameScores = 0;
                    }

                    if (checkIfCutOffRankExceeded(currentRank, cutOff)) {
                        return playersAboveCutoffRank;
                    }
                    currentScore = scores.get(i);
                    playersAboveCutoffRank++;
                    currentRank++;

                    System.out.println("Current Iteration: " + i);
                    System.out.println("Current Score: " + currentScore);
                    System.out.println("Current Rank: " + currentRank);
                    System.out.println("Players Above Cutoff Rank: " + playersAboveCutoffRank);
                }
        }
        return playersAboveCutoffRank;
    }

    private static boolean checkIfCutOffRankExceeded(int currentRank, int cutOff) {
        return (currentRank >= cutOff);
    }

}
