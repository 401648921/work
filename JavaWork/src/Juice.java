import java.time.LocalDate;

public class Juice extends Drinks{
    public Juice(String name, double cost, LocalDate manufactureDate) {
        super(name, cost, manufactureDate, 2);
    }

    @Override
    public String toString() {
        return "{ " +
                "\"产品名\": \""+this.name+"\"," +
                "\"成本\": "+this.cost+"," +
                "\"生产日期\": \""+this.manufactureDate+"\"," +
                "\"保质期\": "+this.period+"}";
    }


}
