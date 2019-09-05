package com.sidneysimmons.simple.boot.lottery.service;

import static org.junit.Assert.assertTrue;

import com.sidneysimmons.simple.boot.lottery.domain.LotteryNumbers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;

/**
 * Unit tests for the {@link LotteryService} class.
 * 
 * @author Sidney Simmons
 */
public class LotteryServiceTest {

    @InjectMocks
    private LotteryService lotteryService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test that lottery numbers are never created equal or above the configured upper limit.
     */
    @Test
    public void testCreateNumbersUpperLimit() {
        // Mock the upper limit and test that we don't see anything over that
        Integer upperLimit = 5;
        ReflectionTestUtils.setField(lotteryService, "upperLimit", upperLimit);
        LotteryNumbers lotteryNumbers = null;
        for (int i = 0; i < 10; i++) {
            lotteryNumbers = lotteryService.createNumbers();
            assertTrue(lotteryNumbers.getNumber1() < upperLimit);
            assertTrue(lotteryNumbers.getNumber2() < upperLimit);
            assertTrue(lotteryNumbers.getNumber3() < upperLimit);
            assertTrue(lotteryNumbers.getNumber4() < upperLimit);
            assertTrue(lotteryNumbers.getNumber5() < upperLimit);
        }
    }

}
