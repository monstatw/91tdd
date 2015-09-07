package tw.monsta.tdd91.day1;

/**
 * Created by johnson on 15/9/7.
 */
public enum OrderField {
    ID(1),COST(2),REVENUE(3),SELLPRICE(4);

    private final int val;

    OrderField(int val) {
        this.val = val;
    }
}
