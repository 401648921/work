import java.time.LocalDate;

public abstract class Drinks {
    protected  String name;  //名字
    protected double cost;  //成本
    protected LocalDate manufactureDate;  //生产日期
    protected int period;  //保质期


    public abstract String toString();

    public Drinks(String mame, double cost, LocalDate manufactureDate, int period) {
        this.name = mame;
        this.cost = cost;
        this.manufactureDate = manufactureDate;
        this.period = period;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
    //判断是否过期的方法
    public boolean judgeDrink(){
        return this.manufactureDate.plusDays(this.period).isBefore(LocalDate.now());
    }

}
