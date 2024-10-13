package eric.leetcode.arraystring;

import java.util.*;

public class RandomizedSet {

    private final Map<Integer, Integer> map;
    private final List<Integer> list;
    private final Random random;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int listIndexToBeOverwrite = map.get(val);
        int lastElement = list.getLast();

        list.set(listIndexToBeOverwrite, lastElement);
        map.put(lastElement, listIndexToBeOverwrite);

        list.removeLast();
        map.remove(val);

        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
