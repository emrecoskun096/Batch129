package practiceDTNT.daytime05;

import java.util.Arrays;

public class C03_KelimeleriTersSiraliArray {
     /*
        Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
        Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
        tersine çevirmek için kod yazınız.
        Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
                */


    // O    D   E   V  \\
    public static void main(String[] args) {

        String str = "Kemal Can Kuzu";
        String arr[] = str.split(" ");
        System.out.println(Arrays.toString(arr));

        String brr[] = new String[arr.length];
        int idx = arr.length - 1;
        for (String w : arr) {
            brr[idx] = w;
            idx--;
        }
        System.out.println(Arrays.toString(brr));


    }
}
