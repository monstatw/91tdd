package tw.monsta.tdd91.day1.object;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by johnson on 15/9/7.
 */
public class TestOrderField {

    @Test
    public void order_has_4_kind_fields() {
        assertThat(4).isEqualTo(OrderField.values().length);
    }
}
