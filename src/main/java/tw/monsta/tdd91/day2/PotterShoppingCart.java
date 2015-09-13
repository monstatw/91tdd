package tw.monsta.tdd91.day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * class description of PotterShoppingCart
 *
 * @author johnson
 */
public class PotterShoppingCart {

    public int total(int first, int second, int third, int fourth, int fifth) {
        List<Integer> suit = Arrays.asList(first, second, third, fourth, fifth);
        return calculateTotal(suit);
    }

    private int calculateTotal(List<Integer> suit) {
        long differentCount = suit.stream()
                .filter(count -> count >= 1)
                .count();
        double discount = getDiscount(differentCount);

        int suitTotal = (int) (100 * differentCount * (1 - discount));

        List<Integer> nextSuit = suit.stream()
                .map(count -> count - 1)
                .collect(Collectors.toList());
        boolean hasNextSuit = nextSuit.stream().anyMatch(count -> count >= 1);

        return suitTotal + (hasNextSuit ? calculateTotal(nextSuit) : 0);
    }

    private double getDiscount(long differentCount) {
        double discount;
        if (differentCount == 5) {
            discount = 0.25;
        } else if (differentCount == 4) {
            discount = 0.2;
        } else if (differentCount == 3) {
            discount = 0.1;
        } else if (differentCount == 2) {
            discount = 0.05;
        } else {
            discount = 0;
        }
        return discount;
    }
}
