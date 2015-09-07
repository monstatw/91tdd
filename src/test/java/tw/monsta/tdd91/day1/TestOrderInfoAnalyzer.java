package tw.monsta.tdd91.day1;

import org.junit.Before;
import org.junit.Test;
import tw.monsta.tdd91.day1.object.Order;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by johnson on 15/9/7.
 * This is the main test class.
 */
public class TestOrderInfoAnalyzer {

    private Order[] orders;

    @Before
    public void setUp() {
        orders = Arrays.asList(
                new Order.OrderBuilder().id(1).cost(1).revenue(11).sellPrice(21).build(),
                new Order.OrderBuilder().id(2).cost(2).revenue(12).sellPrice(22).build(),
                new Order.OrderBuilder().id(3).cost(3).revenue(13).sellPrice(23).build(),
                new Order.OrderBuilder().id(4).cost(4).revenue(14).sellPrice(24).build(),
                new Order.OrderBuilder().id(5).cost(5).revenue(15).sellPrice(25).build(),
                new Order.OrderBuilder().id(6).cost(6).revenue(16).sellPrice(26).build(),
                new Order.OrderBuilder().id(7).cost(7).revenue(17).sellPrice(27).build(),
                new Order.OrderBuilder().id(8).cost(8).revenue(18).sellPrice(28).build(),
                new Order.OrderBuilder().id(9).cost(9).revenue(19).sellPrice(20).build(),
                new Order.OrderBuilder().id(10).cost(10).revenue(20).sellPrice(30).build(),
                new Order.OrderBuilder().id(11).cost(11).revenue(21).sellPrice(31).build()
        ).toArray(new Order[]{});
    }

    @Test
    public void given_orders_summing_cost_groupingIn_3_should_get_result_6_15_24_21() {
//        arrange
        Integer[] expected = {6, 15, 24, 21};
        OrderInfoAnalyzer target = new OrderInfoAnalyzer(orders);
//        act
        Integer[] actual = target.sumFieldWithGroupingCount(3, Order::getCost);
//        assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void given_orders_sum_revenue_groupingIn_4_should_get_result_50_66_60() {
//        arrange
        Integer[] expected = {50, 66, 60};
        OrderInfoAnalyzer target = new OrderInfoAnalyzer(orders);
//        act
        Integer[] actual = target.sumFieldWithGroupingCount(4, Order::getRevenue);
//        assert
        assertThat(actual).isEqualTo(expected);
    }
}
