package tw.monsta.tdd91.day1;

import org.junit.Before;
import org.junit.Test;
import tw.monsta.tdd91.day1.object.Order;
import tw.monsta.tdd91.day1.object.OrderField;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static tw.monsta.tdd91.day1.object.Order.build;

/**
 * Created by johnson on 15/9/7.
 * This is the main test class.
 */
public class TestOrderInfoAnalyzer {

    private Order[] orders;

    @Before
    public void setUp() {
        orders = Arrays.asList(
                build(1, 1, 11, 21), build(2, 2, 12, 22), build(3, 3, 13, 23),
                build(4, 4, 14, 24), build(5, 5, 15, 25), build(6, 6, 16, 26),
                build(7, 7, 17, 27), build(8, 8, 18, 28), build(9, 9, 19, 20),
                build(10, 10, 20, 30), build(11, 11, 21, 31)
        ).toArray(new Order[]{});
    }

    @Test
    public void given_orders_groupingCost_in_3_shouldSuccess() {
//        arrange
        Integer[] expected = {6, 15, 24, 21};
        OrderInfoAnalyzer target = new OrderInfoAnalyzer(orders);
//        act
        Integer[] actual = target.groupingFieldSum(3, OrderField.COST);
//        assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void given_orders_groupingRevenue_in_4_shouldSuccess() {
//        arrange
        Integer[] expected = {50, 66, 60};
        OrderInfoAnalyzer target = new OrderInfoAnalyzer(orders);
//        act
        Integer[] actual = target.groupingFieldSum(4, OrderField.REVENUE);
//        assert
        assertThat(actual).isEqualTo(expected);
    }
}
