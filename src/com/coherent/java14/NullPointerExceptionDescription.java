package com.coherent.java14;

/**
 * Helpful NullPointerExceptions
 * NullPointerExceptions describe exactly which variable was null.
 */
public class NullPointerExceptionDescription {

    public static void main(String[] args) {
        Point point = new Point(null, 2);
        System.out.println(point.x().intValue() + point.y().intValue());
    }

    record Point(Integer x, Integer y) {
    }
}