package com.coherent.java9;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Convenience Factory Methods for Collections – collections can be now initialized using of() methods
 * The collections created using factory methods are immutable
 * No null Element Allowed
 * see: https://www.baeldung.com/java-9-collections-factory-methods
 */
public class ConvenienceFactoryMethodsForCollections {

    public static void main(String[] args) {
        Set<String> set = Set.of("foo", "bar", "baz");
        Stream<String> stream = Stream.of("foo", "bar", "baz");
        Map<String, String> map = Map.of("fooKey", "fooValue", "barKey", "barValue");
    }
}
