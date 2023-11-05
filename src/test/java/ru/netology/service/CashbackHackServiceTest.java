package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test

    public void boundaryValue1000Should0 () {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void boundaryValue999Should1() {

        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void boundaryValue1001Should999() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void equivalenceClassMore1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void equivalenceClassLess1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }
}
