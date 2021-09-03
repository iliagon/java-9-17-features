package com.coherent.java10;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * see: https://developers.redhat.com/blog/2018/05/25/simplify-local-variable-type-definition-using-the-java-10-var-keyword
 */
public class Var {

    public static void main(String[] args) {
        //Bad practice - don't do that. It's not obvious which type has mapToListMap when you read this code
        var mapToListMap = complexMethodThatTeturnsNonObviousType();

        //Good practice - type is obvious
        var sslRMIClientSocketFactory = new SslRMIClientSocketFactory();
    }

    private static Map<Map<String, String>, List<String>> complexMethodThatTeturnsNonObviousType() {
        return new HashMap<>();
    }
}
