public class Main {
    public static void main(String[] args) {
        // Домашнее задание - 1
        // Задание 1
        System.out.println("Задание 1");
        int salary = 29000;
        int total = 0;
        int target = 2_459_000;
        for (int i = 0;total < target;) {
            i++;
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц," + i + " сумма накоплений равна " + total + " рублей");
        }
        // Задание 2
        System.out.println("Задание 2");
        int number = 0;
        while (number <= 9) {
            number = number + 1;
            System.out.print(" "+number);
        }
        for (int i = 10; i >= 1; i--) {
            System.out.print(" "+i);
        }
        // Задание 3

        System.out.println("\nЗадание 3");
        int populationOfTheCountry = 12_000_000;
        int arrivalOfThePopulation = (populationOfTheCountry / 1000) * (17 - 8);
        int totalPopulation = 0;
        for (int i = 1; i <= 10; i++) {
            populationOfTheCountry = populationOfTheCountry + populationOfTheCountry / 1000 * (17-8);
            totalPopulation = populationOfTheCountry;
            System.out.println("Год " + i + " , численность населения составляет " + totalPopulation + " человек.");
        }
        // Домашнее задание - 2
        // Задание 1
        System.out.println("Задание 1");
        total = 0;
        int allPeople = 12_000_000;
        int firstContribution = 15_000;
        for (int month = 1; total <= 12_000_000; month++) {
            total = total + firstContribution;
            total = total + total / 100 * 7;
            System.out.println("Василию понадобится месяцев: " + month + " баланс: " + total);
        }
        // Задание 2
        System.out.println("Задание 2");
        total = 0;
        firstContribution = 15_000;
        for (int month = 1; total <= 12_000_000; month++) {
            total = total + firstContribution;
            total = total + total / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Василию понадобится месяцев: " + month + " баланс: " + total);
            }
        }
        // Задание 3
        System.out.println("Задание 3");
        total = 0;
        firstContribution = 15_000;
        int year = 12 * 9;
        for (int month = 1; month <= year; month++) {
            total = total + firstContribution;
            total = total + total / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Василию понадобится месяцев: " + month + " баланс: " + total);
            }
        }
        // Задание 4
        System.out.println("Задание 4");
        int friday = 2;
        int month = 31;
        for (int i = 0; i <= month; i++) {

            if (i % 7 == friday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }
        // Домашнее задание -3
        // Задание 1
        System.out.println("Задание 1");
        int year2122 = 2122;
        int year1822 = 1822;
        int cometFlyby = 79;
        for (int i = 0; i <= year2122; i = i + cometFlyby) {
            if (i >= year1822 && i <= year2122 ) {
                System.out.println(i);
            }
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