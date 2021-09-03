package com.coherent.java14;

/**
 * see: https://www.baeldung.com/java-pattern-matching-instanceof
 */
public class NewInstanceOfSyntax {

    public static void main1(String[] args) {
        Object obj = "abc";
        oldWay(obj);
        newWay(obj);
    }

    private static void newWay(Object obj) {
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
//            Arrays.asList((String)obj).add(new Object()); //Would not compile if object is actually String!
//            That's why java 14 use a separate variable after 'instanceOf' instead of smartcast (like in kotlin).
//            They cannot lose backward compatibility.
        }
    }

    private static void oldWay(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.toUpperCase());
        }
    }

    record Point(Integer x, Integer y) {
    }
}