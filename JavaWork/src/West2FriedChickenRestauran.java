import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class West2FriedChickenRestauran implements FriedChickenRestaurant{
    private double money;
    private List<Beer> beerList;
    private List<Juice> juiceList;
    private static List<SetMeal> setMealList;
    /*
    啤酒和果汁列表用LinkedList,删除效率高
    套餐用ArrayList，随机访问效率高
     */

    public static List<SetMeal> getSetMealList() {
        return setMealList;
    }

    static {
        setMealList = new ArrayList<SetMeal>();
        setMealList.add(new SetMeal("套餐一",10,"脆皮鸡",new Beer("青岛啤酒",3,null,15)));
        setMealList.add(new SetMeal("套餐二",11,"蜜汁鸡",new Juice("橙汁",3,null)));
        setMealList.add(new SetMeal("套餐三",12,"脆皮鸡",new Beer("雪津",3,null,12)));
    }

    public West2FriedChickenRestauran(double money) {
        this.money = money;
        this.beerList = new LinkedList<Beer>();
        this.juiceList = new LinkedList<Juice>();
    }
    //重载use方法（果汁）
    private void use(Juice juice){
        for(Juice juice1 :this.juiceList){
            if(juice1.name.equals(juice.name)){
                juiceList.remove(juice1);
                return;
            }
        }
        throw new IngredientSortOutException(juice.name);
    }
    //重载use方法（啤酒）
    private void use(Beer beer){
        for(Beer beer1 :this.beerList){
            if(beer1.name.equals(beer.name)){
                juiceList.remove(beer1);
                return;
            }
        }
        throw new IngredientSortOutException(beer.name);
    }
    //出售套餐方法
    @Override
    public void sell(int index) {
        index = index -1;
        if(setMealList.get(index).getDrink() instanceof Beer){
            use((Beer)setMealList.get(index).getDrink());
        }else if(setMealList.get(index).getDrink() instanceof Juice){
            use((Juice) setMealList.get(index).getDrink());
        }
        this.money+=setMealList.get(index).getCost();
    }
    //进货方法
    @Override
    public void purchase(Drinks drinks, int number) {
        if(drinks.cost*number>this.money){
            throw new OverdraftBalanceException(drinks.cost*number-this.money,"缺少"+(drinks.cost*number-this.money)+"元，进货失败");
        }
        //扣钱
        this.money-=drinks.getCost()*number;
        if(drinks instanceof Juice){
            for(int i = 0;i<number;i++){
                juiceList.add((Juice)drinks);
            }
        }else if(drinks instanceof Beer){
            for(int i = 0;i<number;i++){
                beerList.add((Beer)drinks);
            }
        }
    }
}
