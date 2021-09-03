package com.coherent.java14;

import java.util.Objects;

/**
 * Records
 * see: https://nipafx.dev/java-record-semantics/
 */
public class Records {

    public static void main(String[] args) {
        OldPoint oldPoint = new OldPoint(1, 2);
        NewPoint newPoint = new NewPoint(1, 2);
        System.out.println(oldPoint);
        System.out.println(newPoint);
    }


}

record NewPoint(int x, int y) {
    private void someMethod() {
        System.out.println("someMethod");
    }
}

final class OldPoint {
    public final int x;
    public final int y;

    public OldPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private void someMethod() {
        System.out.println("someMethod");
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldPoint oldPoint = (OldPoint) o;
        return x == oldPoint.x && y == oldPoint.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "OldPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
