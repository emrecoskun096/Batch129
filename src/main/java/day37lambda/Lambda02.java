package day37lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lambda02 {

    public static void main(String[] args) throws IOException {

        //1) LambdaTextFile dosyasi icindeki metni console'a yazdiran kodu yaziniz.
        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);

        //2) LambdaTextFile dosyasi icindeki her characteri uppercase yapiniz.
        Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //3) LambdaTextFile dosyasi icinde herhangi bir kelimenin var olup olmadigini gosteren kodu yaziniz
        boolean result1 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                anyMatch(t->t.contains("Java"));
        System.out.println(result1);

        //4) LambdaTextFile dosyasi icindeki her kelimenin "a" icerip icermedigini gosteren kodu yaziniz
        boolean result2 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                allMatch(t->t.contains("a"));
    }

}