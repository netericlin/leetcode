package eric.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTestII {

    @Test
    void givenSomeValue_whenExecute_thenReturnExpectedResult() {

        BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

        assertEquals(7, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(4, solution.maxProfit(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
