package model;

public class FullTime extends Staff {
    private int date;
    private double heso;

    @Override
    public double salary() {
        return heso * date * 200000;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "date=" + date +
                ", heso=" + heso +
                '}' + super.toString();
    }

    public FullTime() {
    }

    public FullTime(int date, double heso) {
        this.date = date;
        this.heso = heso;
    }

    public FullTime(String name, String address, String phone, int date, double heso) {
        super(name, address, phone);
        this.date = date;
        this.heso = heso;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getHeso() {
        return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }
}
