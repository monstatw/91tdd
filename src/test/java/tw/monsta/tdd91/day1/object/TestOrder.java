package tw.monsta.tdd91.day1.object;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by johnson on 15/9/7.
 */
public class TestOrder {

    @Test
    public void buildOrder_id_1_cost_2_revenue_5_sellPrice_7_should_get_cost_2() {
        // java沒有c#那種property自動在constructor裡可指定property name的方式
        // 還是用builder，但改成完整描述清楚的builder pattern

        //arrange
        int expected = 2;
        //act
        Order actual = new Order.OrderBuilder().id(1).cost(2).revenue(5).sellPrice(7).build();
        //assert
        assertThat(actual.getCost()).isEqualTo(expected);
    }

    @Test
    public void buildOrder_id_2_cost_4_revenue_6_sellPrice_8_should_get_revenue_6() {
        int expected = 6;
        Order actual = new Order.OrderBuilder().id(2).cost(4).revenue(6).sellPrice(8).build();
        assertThat(actual.getRevenue()).isEqualTo(expected);
    }
}
