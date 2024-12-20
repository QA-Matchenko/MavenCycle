package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money <= threshold) { // можем ли отдыхать?
                money = money + income;
                money = money - expenses;
            } else {
                money = money - expenses;
                money /= 3; //траты на отдых
                count++; // увеличиваем счётчик месяцев отдыха


            }
        }
        return count;
    }
}
