package ru.netology.javaqa.javaqapack.services;

public class CountService {

    public int calculate(int income, int expenses, int threshold) {

        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                money = money - expenses;
                money = money / 3;
                count ++;
            } else {
                money = money + income;
            }
        }
        return count;
    }
}

