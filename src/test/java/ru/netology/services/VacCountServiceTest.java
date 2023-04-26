package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacCountServiceTest {
    @Test
    public void main () {
        ru.netology.services.VacCountService service = new ru.netology.services.VacCountService();
        int expected = 3;
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        int actual = service.calculete(income, expenses, threshold);

        Assertions.assertEquals(expected,actual);
    }


    @Test

    public void master () {
        ru.netology.services.VacCountService service = new ru.netology.services.VacCountService();
        int expected = 2;
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int actual = service.calculete(income, expenses, threshold);

        Assertions.assertEquals(expected,actual);
    }
}

