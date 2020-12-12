import java.time.LocalDate;

//测试类
public class test {
    public static void main(String[] args) {
        //测试饮料过期函数
        Juice juice = new Juice("果汁",4, LocalDate.now());
        //未过期
        System.out.println(juice.judgeDrink());
        juice.setManufactureDate(juice.getManufactureDate().minusMonths(1));
        //已过期
        System.out.println(juice.judgeDrink());
        //测试toString()方法
        Beer beer = new Beer("雪津",3,LocalDate.now(),15);
        SetMeal setMeal = new SetMeal("套餐一",10,"脆皮鸡",beer);
        System.out.println(beer);
        System.out.println(juice);
        System.out.println(setMeal);
        //测试炸鸡店
        //测试静态语句是否执行
        FriedChickenRestaurant friedChickenRestaurant = new West2FriedChickenRestauran(100);
        System.out.println(West2FriedChickenRestauran.getSetMealList());
        //进货正常
        friedChickenRestaurant.purchase(beer,5);
        //进货失败
        try{
            friedChickenRestaurant.purchase(beer,100);
        }catch(OverdraftBalanceException e){
            System.out.println(e.getMessage());
        }
        //测试正常卖套餐
        friedChickenRestaurant.sell(3);
        //测试卖套餐失败
        try{
            friedChickenRestaurant.sell(2);
        }catch(IngredientSortOutException e){
            System.out.println("缺少"+e.getMessage());
        }
    }
}
