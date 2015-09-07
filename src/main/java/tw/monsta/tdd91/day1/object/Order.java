package tw.monsta.tdd91.day1.object;

/**
 * Created by johnson on 15/9/7.
 */
public class Order {

    private final int id;
    private final int cost;
    private final int revenue;
    private final int sellPrice;

    /**
     * private constructor
     *
     * @param id
     * @param cost
     * @param revenue
     * @param sellPrice
     */
    private Order(int id, int cost, int revenue, int sellPrice) {
        this.id = id;
        this.cost = cost;
        this.revenue = revenue;
        this.sellPrice = sellPrice;
    }

    public static Order build(int id, int cost, int revenue, int sellPrice) {
        return new Order(id, cost, revenue, sellPrice);
    }

    public int getCost() {
        return this.cost;
    }

    public int getRevenue() {
        return this.revenue;
    }
}
