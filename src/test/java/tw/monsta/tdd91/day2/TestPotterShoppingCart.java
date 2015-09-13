package tw.monsta.tdd91.day2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * class description of TestPotterShoppingCart
 *
 * @author johnson
 */
public class TestPotterShoppingCart {

    @Test
    public void buyFirst_1_Others_0_ShouldTotal_100() {
        int first = 1;
        int second = 0;
        int third = 0;
        int fourth = 0;
        int fifth = 0;
        int expected = 100;
        PotterShoppingCart target = new PotterShoppingCart();

        int actual = target.total(first, second, third, fourth, fifth);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void buyFirst_1_Second_1_Others_0_shouldTotal_190() {
        int first = 1;
        int second = 1;
        int third = 0;
        int fourth = 0;
        int fifth = 0;
        int expected = 190;
        PotterShoppingCart target = new PotterShoppingCart();

        int actual = target.total(first, second, third, fourth, fifth);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void buyFirst_1_Second_1_Third_1_Others_0_ShouldTotal_270() {
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 0;
        int fifth = 0;
        int expected = 270;
        PotterShoppingCart target = new PotterShoppingCart();

        int actual = target.total(first, second, third, fourth, fifth);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void buyFirst_1_Second_1_Third_1_Fourth_1_Fifth_0_ShouldTotal_320() {
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 1;
        int fifth = 0;
        int expected = 320;
        PotterShoppingCart target = new PotterShoppingCart();

        int actual = target.total(first, second, third, fourth, fifth);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void buyFirst_1_Second_1_Third_1_Fourth_1_Fifth_1_ShouldTotal_375() {
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 1;
        int fifth = 1;
        int expected = 375;
        PotterShoppingCart target = new PotterShoppingCart();

        int actual = target.total(first, second, third, fourth, fifth);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void buyFirst_1_Second_1_Third_2_Others_0_ShouldTotal_370() {
        int first = 1;
        int second = 1;
        int third = 2;
        int fourth = 0;
        int fifth = 0;
        int expected = 370;
        PotterShoppingCart target = new PotterShoppingCart();

        int actual = target.total(first, second, third, fourth, fifth);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void buyFirst_1_Second_2_Third_2_Fourth_0_Fifth_0_ShouldTotal_460() {
        int first = 1;
        int second = 2;
        int third = 2;
        int fourth = 0;
        int fifth = 0;
        int expected = 460;
        PotterShoppingCart target = new PotterShoppingCart();

        int actual = target.total(first, second, third, fourth, fifth);

        assertThat(actual).isEqualTo(expected);
    }
}
