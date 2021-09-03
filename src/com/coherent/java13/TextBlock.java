package com.coherent.java13;

/**
 * Text Blocks
 * see: https://www.baeldung.com/java-text-blocks
 */
public class TextBlock {

    public static void main(String[] args) {
        System.out.println(oldStringConcatenation());
        System.out.println(newStringConcatenation());
    }

    public static String oldStringConcatenation() {
        return "{\n" +
                "    \"veryLong\": \"dtv_impression_request\",\n" +
                "    \"filter\": \"@campaign=1119379\",\n" +
                "    \"sort\": [],\n" +
                "    \"aggregationType\": \"DAILY\",\n" +
                "    \"startTime\": \"2021-06-01 00:00:00\"," +
                "    \"endTime\": \"2021-08-15 23:59:59\",\n" +
                "}";
    }

    public static String newStringConcatenation() {
        return """
                {
                    "veryLong": "dtv_impression_request",    
                    "filter": "@campaign=1119379",
                    "sort": [],
                    "aggregationType": "DAILY",
                    "startTime": "2021-06-01 00:00:00",\
                    "endTime": "2021-08-15 23:59:59",
                }
                """;
    }


}
