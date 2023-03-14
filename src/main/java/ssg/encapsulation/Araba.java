package ssg.encapsulation;

public class Araba {
    String marka="marka belirtilmedi";
    private String model="model belirtilmedi";
    private String yakit="dizel";

    public String getYakit() {

        return yakit;
    }

    public void setModel(String model) {
        this.model = model;
    }
}