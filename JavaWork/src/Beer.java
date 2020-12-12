import java.time.LocalDate;

public class Beer extends Drinks{
    private float alcoholDegree; //酒精度数

    public Beer(String name, double cost, LocalDate manufactureDate,  float alcoholDegree) {
        super(name, cost, manufactureDate, 30);
        this.alcoholDegree = alcoholDegree;
    }

    @Override
    public String toString() {
        return "{ " +
                "\"产品名\": \""+this.name+"\"," +
                "\"成本\": "+this.cost+"," +
                "\"生产日期\": \""+this.manufactureDate+"\"," +
                "\"保质期\": "+this.period+"," +
                "\"酒精度数\": "+this.alcoholDegree+"}";
    }

    public float getAlcoholDegree() {
        return alcoholDegree;
    }

    public void setAlcoholDegree(float alcoholDegree) {
        this.alcoholDegree = alcoholDegree;
    }
}
