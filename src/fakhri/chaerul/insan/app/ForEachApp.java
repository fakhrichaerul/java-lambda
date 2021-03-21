package fakhri.chaerul.insan.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {

        List<String> list = List.of("Fakhri", "Chaerul", "Insan");
        
        // Dengan for loop
        for (String s : list) {
            System.out.println(s);
        }

        // Dengan Anonymous Class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // Dengan Lambda
        list.forEach(value -> System.out.println(value));

        // Dengan Lambda Method Reference
        list.forEach(System.out::println);
    }
}
