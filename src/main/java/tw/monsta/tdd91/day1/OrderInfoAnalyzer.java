package tw.monsta.tdd91.day1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnson on 15/9/7.
 */
public class OrderInfoAnalyzer {

    private final Order[] orders;

    public OrderInfoAnalyzer(Order[] orders) {
        this.orders = orders;
    }

    /**
     * 以groupCount個Order為一組，計算cost的總和
     *
     * @param groupCount 幾個為一組
     * @param fieldType 取Order哪一個欄位
     * @return grouping後加總的結果
     */
    public Integer[] groupingFieldSum(int groupCount, OrderField fieldType) {
        List<Integer> resultList = new ArrayList<>();
        int tempCostSum = 0;

        //TODO 應可用lambda變的更簡單一點
        for (int i = 0; i < orders.length; i++) {
            tempCostSum += getValue(orders[i], fieldType);
            //reset zero
            if (i % groupCount == groupCount - 1) {
                resultList.add(tempCostSum);
                tempCostSum = 0;
            }

        }
        if (tempCostSum > 0) {
            resultList.add(tempCostSum);
        }
        return resultList.toArray(new Integer[]{});
    }

    /*
     * 依據fieldType取得對應的Order field value
     */
    private int getValue(Order order, OrderField fieldType) {
        if (fieldType == OrderField.COST) {
            return order.getCost();
        } else if (fieldType == OrderField.REVENUE) {
            return order.getRevenue();
        }
        return 0;
    }
}
