package ssg.encapsulation;

public class Ogretmen {
    //encapsulation sadece sinirlama icin degil yapilan
    //isi daha iyi tanimak icinde kullanilir
    //bu yaklasimi kullanan class'lara tum variable'lari
    //private yapilir
    //getter ve setter yapilir hepsi icin
    private String isim;
    private String soyisim;
    private String brans;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}