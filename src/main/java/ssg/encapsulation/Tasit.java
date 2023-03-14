package ssg.encapsulation;
public class Tasit {
    private String tasitTuru;
    private boolean otomatikVitesMi;
    private int motorGucu;

    public String getTasitTuru() {
        return tasitTuru;
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }

    public boolean isOtomatikVitesMi() {
        return otomatikVitesMi;
    }

    public void setOtomatikVitesMi(boolean otomatikVitesMi) {
        this.otomatikVitesMi = otomatikVitesMi;
    }

    public int getMotorGucu() {
        return motorGucu;
    }

    public void setMotorGucu(int motorGucu) {
        this.motorGucu = motorGucu;
    }
}