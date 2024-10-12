package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {

    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

        assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
