package fakhri.chaerul.insan.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(60, ()->getName()
        );

    }

    //CARA BIASA
//    public static void testScore(int score, String name) {
//        if(score > 80){
//            System.out.println("Selamat " + getName() + " Anda Lulus");
//        }else{
//            System.out.println("Coba lagi tahun depan");
//        }
//    }

    // Lazy Parameter lebih efisien ketika memproses data yang besar
    public static void testScore(int score, Supplier<String> name) {
        if(score > 80){
            System.out.println("Selamat " + name.get() + " Anda Lulus");
        }else{
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName(){
        System.out.println("Method getName() dipanggil");
        return "Fakhri";
    }

}
