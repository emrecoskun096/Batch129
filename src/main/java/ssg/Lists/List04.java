package ssg.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List04 {

    public static void main(String[] args) {

        // verilen bir array'i listeye cevirin

        String arr[]={"A" , "B" , "C"};
        System.out.println(Arrays.toString(arr));
        List<String> arraydenList = new ArrayList<>(List.of(arr));
        System.out.println(arraydenList);//[A, B, C]
        List<String> arraydenList2 = Arrays.asList(arr);
        System.out.println(arraydenList);
    }
}