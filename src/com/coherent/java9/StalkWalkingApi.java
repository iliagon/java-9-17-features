package com.coherent.java9;

import java.util.List;

/**
 * StalkWalking API – API providing lazy access to the information in stack traces.
 * see: https://www.baeldung.com/java-9-stackwalking-api
 */
public class StalkWalkingApi {

    public static void main(String[] args) {
        List<StackWalker.StackFrame> walk = StackWalker.getInstance()
                .walk(stackFrameStream ->
                        stackFrameStream.toList());

        walk.forEach(System.out::println);
    }
}
