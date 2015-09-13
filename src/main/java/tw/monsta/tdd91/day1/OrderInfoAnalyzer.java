package tw.monsta.tdd91.day1;

import tw.monsta.tdd91.day1.object.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

/**
 * Created by johnson on 15/9/7.
 * This is the main application.
 */
public class OrderInfoAnalyzer {

    private final Order[] orders;

    public OrderInfoAnalyzer(Order[] orders) {
        this.orders = Arrays.copyOf(orders, orders.length);
    }

    /**
     * 依據groupCount分群，取得每一群的值加總並回傳
     * 取值方式依據傳入的function決定
     *
     * @param groupCount 以幾個分群
     * @param function 取值function，會是{@link Order}的method reference
     * @return groups summing result
     */
    public Integer[] sumFieldWithGroupingCount(int groupCount, ToIntFunction<Order> function) {
        List<Integer> rtn = new ArrayList<>();
        List<Order> orderList = Arrays.asList(this.orders);

        int index = 0;
        while (index <= orderList.size()) {
            rtn.add(
                    orderList
                            .stream().sequential()
                            .skip(index).limit(groupCount)
                            .mapToInt(function)
                            .sum()
            );
            index += groupCount;
        }

        return rtn.toArray(new Integer[]{});
    }
}
