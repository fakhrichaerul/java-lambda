package fakhri.chaerul.insan.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Fakhri Chaerul Insan";
            }
        };

        System.out.println(supplier.get());
    }
}
