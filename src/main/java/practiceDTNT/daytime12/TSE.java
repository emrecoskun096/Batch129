package practiceDTNT.daytime12;

public abstract class TSE {


    public static void main(String[] args) {
        BagetEkmek baget = new BagetEkmek();
        baget.gramaj500();
        baget.hijyenikOlma();
        baget.odunAtesindePiser();
        baget.undanYapilir();

        System.out.println("*****************");
        DiyetEkmek diyet = new DiyetEkmek();
        diyet.gramaj500();
        diyet.hijyenikOlma();
        diyet.odunAtesindePiser();
        diyet.undanYapilir();

    }

    abstract void gramaj500();// childlar buna uymak zorunda

    abstract void hijyenikOlma();

    void odunAtesindePiser() {
        System.out.println("TSE odun atesinde piser");
    }

    void undanYapilir() {
        System.out.println("TSE undan yapilir");
    }

}