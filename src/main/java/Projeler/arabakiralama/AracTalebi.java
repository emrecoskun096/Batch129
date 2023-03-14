package Projeler.arabakiralama;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AracTalebi {

    //	alınacaksehir, alınacakgun, alıssaati, teslimGunu, teslimSaati (kiralama ile ilgili bilgiler)
    private String alinacakSehir;

    private LocalDate alinacakGun;

    private LocalDate teslimGunu;

    private LocalTime teslimSaati;

    public AracTalebi(String alinacakSehir, LocalDate alinacakGun, LocalDate teslimGunu, LocalTime teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.alinacakGun = alinacakGun;
        this.teslimGunu = teslimGunu;
        this.teslimSaati = teslimSaati;
    }


    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public LocalDate getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(LocalDate alinacakGun) {
        this.alinacakGun = alinacakGun;
    }

    public LocalDate getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(LocalDate teslimGunu) {
        this.teslimGunu = teslimGunu;
    }

    public LocalTime getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(LocalTime teslimSaati) {
        this.teslimSaati = teslimSaati;
    }
}