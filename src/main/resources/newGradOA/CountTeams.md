Count Teams - New Grad
https://algo.monster/problems/count_teams

A Company Area Manager is trying to assemble a specialized team from a roster of available associates. There is a minimum number of associates to be involved, and each associate needs to have a skill rating within a certain range.

Given a list of associates' skill levels with desired upper and lower bounds, determine how many teams can be created from the list.

Write an algorithm to find the number of teams that can be created by fulfilling the criteria.

Input
The input consists of five arguments:

num: an integer representing the number of associates

skills : a list of integers representing the skill levels of associates

minAssociates: an integer representing the minimum number of team members required

minLevel: an integer representing the lower limit for skill level, inclusive

maxLevel: an integer representing the upper limit for skill level, inclusive

Output
Return an integer representing the total number of teams that can be formed per the criteria.

Constraints
1 <= num <= 20

1 <= minAssociates <= num

1 <= minLevel <= maxLevel <= 1000

1 <= skills[i] <= 1000

0 <= i < num

Examples
Example 1:
Input:
num = 6

skills = [12, 4, 6, 13, 5, 10]

minAssociates = 3

minLevel = 4

maxLevel = 10

Output: 5
Explanation:
The list includes associates with skill levels [12, 4, 6, 13,5, 10]. They want to hire at least 3 associates with skill levels between 4 and 10, inclusive.

Four of the associates with the following skill levels {4, 6, 5, 10} meet the criteria.

There are 5 ways to form a team of 3 associates : {4,5,6}, {4, 6, 10}, {4,5,10}, {5, 6, 10}, and {4, 5, 6, 10}. So the output is 5.
