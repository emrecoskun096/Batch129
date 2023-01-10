package day21statickeyword;

public class StdRunner {

    public static void main(String[] args) {

        //stdName sctatic oldugundan, ona ulasmak icin object olusturmadim
        //Sadece class ismini kullanmak yeterlidir.
        System.out.println(Student.stdName);

        //age non-static oldugundan ona ulasmak icin object olusturmak
        //zorundayiz.
        Student std1 = new Student();
        System.out.println(std1.age);

        String initials = Student.getInitials("Sefa Eyer");
        System.out.println(initials);//SE

        int vowels = std1.countVowels("Tom Cruise");
        System.out.println(vowels);//4

        //static olanlari object ile cagirmak tavsiye edilmez.
        String s = std1.getInitials("Ali Can");
        System.out.println(s);

    }

}
