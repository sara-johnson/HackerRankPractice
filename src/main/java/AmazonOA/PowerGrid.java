package AmazonOA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * https://algo.monster/problems/min_cost_to_connect_all_nodes
 */
public class PowerGrid {

    PriorityQueue<Edge> pq = new PriorityQueue<>();
    boolean[] marked = new boolean[1];
    List<Edge> mst = new LinkedList<>();

    private class Edge implements Comparable {
        int from;
        int to;
        int cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Object o) {
            Edge that = (Edge) o;
            return Integer.compare(this.cost, that.cost);
        }
    }

    public int minimumCost(int N, int[][] connections) {
        marked = new boolean[N];
        List<List<Edge>> graph = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            graph.add(new LinkedList<>());
        }
        for (int[] connection : connections) {
            graph.get(connection[0] - 1).add(new Edge(connection[0] - 1,
                connection[1] - 1, connection[2]));
            graph.get(connection[1] - 1).add(new Edge(connection[1] - 1, connection[0]
                - 1, connection[2]));
        }
        visit(graph, 0);
        while (!pq.isEmpty()) {
            Edge e = pq.poll();
            if (marked[e.from] && marked[e.to]) {
                continue;
            }
            mst.add(e);
            visit(graph, e.from);
            visit(graph, e.to);
        }
        for (boolean marker : marked) {
            if (marker == false) {
                return -1;
            }
        }
        return mst.stream().map(e -> e.cost).reduce(0, Integer::sum);
    }

    private void visit(List<List<Edge>> graph, int v) {
        marked[v] = true;
        for (Edge e : graph.get(v)) {
            if (!marked[e.to]) {
                pq.add(e);
            }
        }
    }

}
