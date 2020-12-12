public class SetMeal {
    private String mealName;
    private double cost;
    private String chickenName;
    private Drinks drink;

    public SetMeal(String mealName, double cost, String chickenName, Drinks drink) {
        this.mealName = mealName;
        this.cost = cost;
        this.chickenName = chickenName;
        this.drink = drink;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getChickenName() {
        return chickenName;
    }

    public void setChickenName(String chickenName) {
        this.chickenName = chickenName;
    }

    public Drinks getDrink() {
        return drink;
    }

    public void setDrink(Drinks drink) {
        this.drink = drink;
    }
    public String toString(){
        return "{ " +
                "\"套餐名\": \""+this.mealName+"\"," +
                "\"套餐价格\": "+this.cost+"," +
                "\"炸鸡名\": \""+this.chickenName+"\"," +
                "\"饮料\": "+this.drink.toString()+"}";
    }
}
