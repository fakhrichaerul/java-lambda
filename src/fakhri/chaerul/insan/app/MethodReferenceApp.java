package fakhri.chaerul.insan.app;

import fakhri.chaerul.insan.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
            // pemanggillan static method
//        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase; // Cara lebih singkat

        System.out.println(predicateIsLowerCase.test("Fakhri"));
        System.out.println(predicateIsLowerCase.test("fakhri"));


        // Method Reference Parameter, hanya berlaku jika returnnya tidak punya parameter
        Function<String, String> functionUpperCase = String::toUpperCase;

        System.out.println(functionUpperCase.apply("Fakhri"));

    }

    public void run(){
        // Memanggil method yang bukan static harus dideclare variable dulu
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateLowerCase = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return app.isLowerCase(value);
            }
        };

        System.out.println(predicateLowerCase.test("Chaerul"));
        System.out.println(predicateLowerCase.test(""));




    }




    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if(!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
