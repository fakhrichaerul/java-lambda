package fakhri.chaerul.insan.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("Fakhri", "Chaerul", "Insan"));


//        for (String name : names) {   //ERROR
//            if(name.length()>5){
//                names.remove(name);
//            };
//        }

//        names.removeIf(new Predicate<String>() {  //Berhasil dengan anonyomous class
//            @Override
//            public boolean test(String s) {
//                return s.length() <= 5;
//            }
//        });

        names.removeIf(name -> name.length() <= 5);  // Solusi paling elegan

        System.out.println(names);
    }
}
