package fakhri.chaerul.insan.app;

import fakhri.chaerul.insan.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//        SimpleAction simpleAction = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Fakhri";
//            }
//        };
//
//        System.out.println(simpleAction.action("Fakhri"));
//
//        SimpleAction simpleAction2 = (String name) -> "Fakhri";
//
//        System.out.println(simpleAction2.action("Fakhri"));

        SimpleAction simpleAction = (String value) -> {
            return "Hello " + value;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction3 = name -> "Hello " + name;

    }
}
