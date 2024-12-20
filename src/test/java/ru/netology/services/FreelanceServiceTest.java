package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FreelanceServiceTest {

    @Test
    public void testCalculateIncome10_000() {

        FreelanceServiceTest service = new FreelanceServiceTest();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    private int calculate(int income, int expenses, int threshold) {
        return income;
    }

    @Test
    public void testCalculateIncome100_000() {

        FreelanceServiceTest service = new FreelanceServiceTest();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}