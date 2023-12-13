package model;

public class PartTime extends Staff{
    private int count;

    @Override
    public double salary() {
        return count*4*30000;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "count=" + count +
                '}' + super.toString();
    }

    public PartTime() {
    }

    public PartTime(int count) {
        this.count = count;
    }

    public PartTime(String name, String address, String phone, int count) {
        super(name, address, phone);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
