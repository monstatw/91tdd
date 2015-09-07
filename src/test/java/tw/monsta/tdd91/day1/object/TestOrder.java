package tw.monsta.tdd91.day1.object;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by johnson on 15/9/7.
 */
public class TestOrder {

    @Test
    public void buildOrder_id_1_cost_2_revenue_5_sellPrice_7_shouldGetOrderWith_cost_2() {
        Order expected = Order.build(1, 2, 5, 7);

        assertThat(2).isEqualTo(expected.getCost());
    }
}
