package org.mylab.alg;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;

public class AlgTest {

    private Alg alg = new Alg();

    @Test
    public void test1() {
        int[] arr = new int[] {1,2};
        int k = 3;
        List<Pair<Integer>> pairs = alg.getPairs(arr, k);
        System.out.println(pairs.toString());
    }

    @Test
    public void test2() {
        int[] arr = new int[] {1,2,4,8,9,4,7};
        int k = 8;
        List<Pair<Integer>> pairs = alg.getPairs(arr, k);
        System.out.println(pairs.toString());
    }

    @Test
    public void test3() {
        int[] arr = new int[] {1,2,4,8,9,4,7};
        int k = 5;
        List<Pair<Integer>> pairs = alg.getPairs(arr, k);
        System.out.println(pairs.toString());
    }

    @Test
    public void test4() {
        int[] arr = new int[] {0,1,2,4,8,9,4,7};
        int k = 8;
        List<Pair<Integer>> pairs = alg.getPairs(arr, k);
        System.out.println(pairs.toString());
    }

    @Test
    public void test5() {
        int[] arr = new int[] {5,1,2,4,-8,9,-4,7};
        int k = 3;
        List<Pair<Integer>> pairs = alg.getPairs(arr, k);
        System.out.println(pairs.toString());
    }

}
