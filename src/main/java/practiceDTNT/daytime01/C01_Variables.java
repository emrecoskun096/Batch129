package practiceDTNT.daytime01;

public class C01_Variables {


    public static void main(String[] args) {

        //byte; short; integer; long; double; float data type larının
        // max ve min değerlerini yazdıran kodu yazınız?

        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("byteMax="+byteMax);//127
        System.out.println("byteMin="+byteMin);//-128

        short shortMax=Short.MAX_VALUE;
        short shortMin=Short.MIN_VALUE;

        System.out.println("shortMax="+shortMax);//32767
        System.out.println("shortMin="+shortMin);//-32768

        int intMax= Integer.MAX_VALUE;
        int intMin= Integer.MIN_VALUE;

        System.out.println("intMax="+intMax);//2147483647
        System.out.println("intMin="+intMin);//-2147483648

        long longMax= Long.MAX_VALUE;
        long longMin=Long.MIN_VALUE;

        System.out.println("longMax="+longMax); //9223372036854775807
        System.out.println("longMin="+longMin);//-9223372036854775808

        double doubleMax=Double.MAX_VALUE;
        double doubleMin=Double.MIN_VALUE;

        System.out.println("doubleMax="+doubleMax);//1.7976931348623157E308
        System.out.println("doubleMin="+doubleMin);//4.9E-324

        float floatMax=Float.MAX_VALUE;
        float floatMin=Float.MIN_VALUE;

        System.out.println("floatMax="+floatMax);//3.4028235E38
        System.out.println("floaatMin="+floatMin);//1.4E-45

        /**
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
                salona devam edeceği ay süresi
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */








    }
}
