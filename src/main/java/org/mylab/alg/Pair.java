package org.mylab.alg;

import java.util.Objects;

public class Pair<T> {

    private T e1;
    private T e2;

    public Pair(T e1, T e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public static <T> Pair<T> of(T e1, T e2) {
        return new Pair(e1, e2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pair<?> pair = (Pair<?>) o;
        return Objects.equals(e1, pair.e1) && Objects.equals(e2, pair.e2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(e1, e2);
    }

    @Override
    public String toString() {
        return "{" + e1 + ", " + e2 + '}';
    }

}
