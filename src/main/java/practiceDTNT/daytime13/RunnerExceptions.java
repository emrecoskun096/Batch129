package practiceDTNT.daytime13;



import static practiceDTNT.daytime13.MyExceptions.str;

public class RunnerExceptions {

    public static void main(String[] args) {

        MyExceptions my = new MyExceptions(str);

        try {
            int x =100, y=5;
            float ortalama = (float) x/(float)y;
            if(ortalama<50){
                throw new IllegalArgumentException(" Ortalama cok Dusuk");
            }
        } catch (Exception e) {
            System.out.println("Sorunun kaynagi ne ==> "+e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println(str);
        }
    }
}