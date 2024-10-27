package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test

    public void testRemain() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual,expected);

    }

    @Test

    public void testRemain1() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(126800);
        int expected = 200;

        assertEquals(actual, expected);
    }
}