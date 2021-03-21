package fakhri.chaerul.insan.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("first","Fakhri");
        map.put("middle","Chaerul");
        map.put("last","Insan");

        // For loop
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ; " + entry.getValue());
        }

        // For Lambda
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + " : " + s2);
            }
        });

    }
}
