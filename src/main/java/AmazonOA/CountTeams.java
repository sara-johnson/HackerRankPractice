package AmazonOA;

public class CountTeams {
    public static int countTeams(int numOfAssociates, int[] skillLevelOfAssociates, int minAssociatesReq, int minLevel, int maxLevel){

        //number of teams that can be created fulfilling the criteria

        //Find the eligible skills between min and max and count how many there are.
        int counter = 0;
        for (int skillLevel : skillLevelOfAssociates) {
            if (skillLevel >= minLevel && skillLevel <= maxLevel) {
                counter++;
            }
        }

        //Create a new array to hold the first set of factorials
        int[] teams = new int[counter + 1];
        teams[0] = 1;
        for (int i = 1; i < numOfAssociates; i++) {
            teams[i] = teams[i - 1] * i;
        }

        //Use the Combination (not permutation!!!) calculation to get the count of teams.
        int countTeams = 0;
        for (int i = minAssociatesReq; i <= counter; i++) {
            countTeams += teams[counter] / teams[i] * teams[counter - i];
        }

        return countTeams;
    }

}
