package practiceDTNT.daytime13;

public class Test2 {
    String str = "a";
    void a() {
        try {
            str = str + "b";
            b();
        } catch (Exception e) {
            str = str + "c";
        }    }
    void b() throws Exception {
        try {
            str = str + "d";
            c();
        } catch (Exception e) {
            str = str + "e";
        } finally {
            str = str + "f";
        }
        str = str + "g";    }
    void c() throws Exception {
        System.out.println(12/0);    }
    void display() {
        System.out.println(str);    }
    public static void main(String[] args) {
        Test2 object = new Test2();
        object.a();
        object.display();
    }
}