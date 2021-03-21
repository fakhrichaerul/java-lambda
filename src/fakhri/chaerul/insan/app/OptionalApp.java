package fakhri.chaerul.insan.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {

        sayHello("Fakhri");

        String name = null;

        sayHello(name);
    }


    public static void sayHello(String name) {
        //CARA DEKLARASI MAP ifPresent
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(x -> System.out.println("HELLO " + x),
//                        () -> System.out.println("HELLO")
//                );

        //CARA DEKLARASI MAP orElse
        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

        System.out.println("HELLO "+ upperName);

        //CARA DEKLARASI BIASA
//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalName.map(String::toUpperCase);
//        optionalNameUpper.ifPresent(s -> System.out.println("HELLO "+s));

        //ERROR NULLPOINTEREXCEPTION
//        String nameUpper = name.toUpperCase();
//        System.out.println("Hello " + nameUpper);

//        If Check Null
//        if(name!=null){
//            String upperName = name.toUpperCase();
//            System.out.println("HELLO " + upperName);
//        }

    }
}
