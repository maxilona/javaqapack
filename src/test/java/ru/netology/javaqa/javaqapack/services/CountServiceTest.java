package ru.netology.javaqa.javaqapack.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountServiceTest {
    @Test
    public void testCalcMonths1() {
        CountServiceTest service = new CountServiceTest();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);

        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}





