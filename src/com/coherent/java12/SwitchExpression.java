package com.coherent.java12;

import java.util.List;
import java.util.random.RandomGenerator;

/**
 * Switch Expression
 * see: https://www.baeldung.com/java-switch
 */
public class SwitchExpression {

    public static void main(String[] args) {
        int random = RandomGenerator.getDefault().nextInt(0, 2);
        List<String> animals = List.of("DOG", "CAT", "TIGER", "unknown");
        String randomAnimal = animals.get(random);

        String a1 = exampleOfIF(randomAnimal);
        String a2 = exampleOfOldSwitch(randomAnimal);
        String a3 = exampleOfNewSwitch(randomAnimal);
        System.out.println(a1 + a2 + a3);
    }

    public static String exampleOfIF(String animal) {
        String result;
        if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "wild animal";
        } else {
            var unknownAnimalPrefix = "unknown animal: ";
            result = unknownAnimalPrefix + animal;
        }
        return result;
    }

    public static String exampleOfOldSwitch(String animal) {
        String result;
        switch (animal) {
            case "DOG":
            case "CAT":
                result = "domestic animal";
                break;
            case "TIGER":
                result = "wild animal";
                break;
            default:
                var unknownAnimalPrefix = "unknown animal: ";
                result = unknownAnimalPrefix + animal;
                break;
        }
        return result;
    }

    public static String exampleOfNewSwitch(String animal) {
        var str = switch (animal) {
            case "DOG", "CAT" -> "domestic animal";
            case "TIGER" -> "wild animal";
            default -> {
                var unknownAnimalPrefix = "unknown animal: ";
                yield unknownAnimalPrefix + animal;
            }
        };
        return str;
    }
}
