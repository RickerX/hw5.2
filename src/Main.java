public class Main {
    public static void main(String[] args) {
        // Домашнее задание - 1
        // Задание 1
        System.out.println("Задание 1");
        int salary = 29000;
        int total = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц, сумма накоплений равна " + total + " рублей");
        }
        // Задание 2
        System.out.println("Задание 2");
        int number = 0;
        while (number <= 9) {
            number = number + 1;
            System.out.println(number);
        }
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        // Задание 3
        System.out.println("Задание 3");
        int populationOfTheCountry = 12_000_000;
        int arrivalOfThePopulation = (populationOfTheCountry / 1000) * (17 - 8);
        int totalPopulation = 0;
        for (int i = 1; i <= 10; i++) {
            arrivalOfThePopulation = (populationOfTheCountry / 1000) * (17 - 8);
            populationOfTheCountry = populationOfTheCountry + arrivalOfThePopulation;
            totalPopulation = populationOfTheCountry;
            System.out.println("Год " + i + " , численность населения составляет " + totalPopulation + " человек.");
        }
        // Домашнее задание - 2
        // Задание 1
        System.out.println("Задание 1");
        int Total = 0;
        int firstContribution = 15_000;
        for (int i = 1; Total <= 12_000_000; i++) {
            Total = Total + firstContribution;
            Total = Total + Total / 100 * 7;
            System.out.println("Василию понадобится месяцев: " + i + " баланс: " + Total);
        }
        // Задание 2
        System.out.println("Задание 2");
        Total = 0;
        firstContribution = 15_000;
        for (int i = 1; Total <= 12_000_000; i++) {
            Total = Total + firstContribution;
            Total = Total + Total / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Василию понадобится месяцев: " + i + " баланс: " + Total);
            }
        }
        // Задание 3
        System.out.println("Задание 3");
        Total = 0;
        firstContribution = 15_000;
        for (int i = 1; i <= 108; i++) {
            Total = Total + firstContribution;
            Total = Total + Total / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Василию понадобится месяцев: " + i + " баланс: " + Total);
            }
        }
        // Задание 4
        System.out.println("Задание 4");
        int friday = 2;
        int month = 31;
        for (int i = 0; i <= 31; i++) {

            if (i % 7 == friday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }
        // Домашнее задание -3
        // Задание 1
        System.out.println("Задание 1");
        int year2022 = 2022;
        while (year2022 <= 2222) {
            year2022 = year2022 + 79;
            System.out.println(year2022);
        }
        // Задание 2
        System.out.println("Задание 2");
        int a = 2;
        int c = 0;
        for (int i = 1; i <= 10; i++) {
            c = i * a;
            System.out.println(a + "*" + i + "=" + c);
        }
    }
}