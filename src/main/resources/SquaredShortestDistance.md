Squared Shortest Distance
https://algo.monster/problems/squared_shortest_distance

A Company has a warehouse and it is a single-story space station measuring E9 meters in length and width (1 billion meters, or approximately 3.3 light-seconds).

The warehouse runs a fleet of up to 10,000 autonomous robots that magnetically attach to the floor of the station, eliminating the need for artificial gravity. The Company has asked you to find the squared distance between the two closest robots.

Given the position of n robots in the warehouse, write an algorithm to find the squared shortest distance between them.

Input
The input consists of three arguments:

numRobots: an integer representing the number of robots(n)

positionX : a list of integers representing the x coordinates of the robot's position in meters

positionY: a list of integers representing the y coordinates of the robot's position in meters

Output
Return an integer representing the squared shortest distance between the pairs of robots.

Constraints
2 <= numRobots <= 10^5

0 <= positionX[i], positionY[i] <= 10^9

0 <= i < numRobots

Note
The squared distance between a pair of robots with xy coordinates of positions (X1, Y1) and (X2, Y2) is calculated using the formula (X1-X2)^2 + (Y1-Y2)^2. if the squared distance is 0 between a pair of robots then the robots are present at the same position and the distance will not be considered.

Examples
Example 1:
Input:
numRobots = 3

positionX = [0,1,2]

positionY = [0,1,4]

Output: 2
Explanation:
There are 3 robots with positions of x coordinates [0,1,2] and y coordinates = [0,1,4].

The robots have the xy coordinates of positions of (0,0), (1, 1) and (2,4).

The closest robots are (0, 0) and (1,1), and closest squared Euclidean distance is (1-0)^2 + (1-0)^2 = 2.

Example 2:
Input:
numRobots = 3

positionX = [0,2,0]

positionY = [0,3,0]

Output: 13
Explanation:
There are 3 robots (0, 0), (2, 3) and (0, 0)

Here robot1 and robot3 distance at the Euclidean position, so the distance is not considered.

The closest squared Euclidean distance is (0-2)^2 + (0-3)^2 = 13.
