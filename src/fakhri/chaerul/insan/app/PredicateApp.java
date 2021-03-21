package fakhri.chaerul.insan.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        Predicate<String> predicateCheckBlank = String::isBlank;

        System.out.println(predicateCheckBlank.test("Fakhri"));
        System.out.println(predicateCheckBlank.test(""));
    }


}
