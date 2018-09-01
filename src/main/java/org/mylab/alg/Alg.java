package org.mylab.alg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Alg {

    public static void main(String[] args) {

    }

    public List<Pair<Integer>> getPairs(int[] arr, int k) {
        List<Pair<Integer>> pairs = new ArrayList<>();
        Map<Integer, Integer> test = new HashMap<>();

        for (int i=0; i<arr.length; i++) {
            int diff = k - arr[i];
            Integer index = test.get(diff);

            if (index != null) {
                pairs.add(Pair.of(i, index));
                test.put(arr[i], i);
            } else {
                test.put(arr[i], i);
            }
        }

        return pairs;
    }

}


