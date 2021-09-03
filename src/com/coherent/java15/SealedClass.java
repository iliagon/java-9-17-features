package com.coherent.java15;

import java.util.random.RandomGenerator;

/**
 * A class or interface may be declared sealed,
 * which means that only a specific set of classes or interfaces may directly extend it
 * See: https://www.infoq.com/articles/java-sealed-classes/
 */
public class SealedClass {

    public static void main(String[] args) {
        StudentRequest studentRequest = handleRequest();
        switch (studentRequest){
            case PostRequest postRequest -> System.out.println("doSmth with "+postRequest.getName()); // switch-case pattern matching (preview only!)
            case PutRequest putRequest -> System.out.println("doSmth with "+putRequest.getName() + "with id " +putRequest.getId());
        }
    }

    private static StudentRequest handleRequest() {
        int random = RandomGenerator.getDefault().nextInt(0, 2);
        return switch (random) {
            case 0 -> new PostRequest("Alex");
            case 1 -> new PutRequest("Alex", 1);
            default -> throw new IllegalStateException("Unexpected value: " + random);
        };
    }
}

abstract sealed class StudentRequest {
    private final String name;

    StudentRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

final class PostRequest extends StudentRequest {
    PostRequest(String name) {
        super(name);
    }
}

final class PutRequest extends StudentRequest {
    private final int id;

    PutRequest(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}