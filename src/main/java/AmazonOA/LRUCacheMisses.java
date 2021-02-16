package AmazonOA;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LRUCacheMisses {

    public int lruCacheMisses(int num, List<Integer> pages, int maxCacheSize) {
        int cacheMisses = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (Integer page : pages) {
            if (!queue.contains(page) && queue.size() < maxCacheSize) {
                queue.add(page);
                cacheMisses++;
            } else if (!queue.contains(page) && queue.size() >= maxCacheSize) {
                queue.poll();
                queue.add(page);
                cacheMisses++;
            } else if (queue.contains(page) && queue.size() < maxCacheSize) {
                queue.remove(page);
                queue.add(page);
            } else if (queue.contains(page) && queue.size() >= maxCacheSize) {
                queue.remove(page);
                queue.add(page);
            }
        }

        return cacheMisses;
    }

}
