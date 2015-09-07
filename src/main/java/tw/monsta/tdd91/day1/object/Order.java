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
     * build Order by OrderBuilder
     *
     * @param builder
     */
    private Order(OrderBuilder builder) {
        this.id = builder.id;
        this.cost = builder.cost;
        this.revenue = builder.revenue;
        this.sellPrice = builder.sellPrice;
    }

    public int getCost() {
        return this.cost;
    }

    public int getRevenue() {
        return this.revenue;
    }

    public static class OrderBuilder {

        private int id;
        private int cost;
        private int revenue;
        private int sellPrice;

        public OrderBuilder id(int id) {
            this.id = id;
            return this;
        }

        public OrderBuilder cost(int cost) {
            this.cost = cost;
            return this;
        }

        public OrderBuilder revenue(int revenue) {
            this.revenue = revenue;
            return this;
        }

        public OrderBuilder sellPrice(int sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
