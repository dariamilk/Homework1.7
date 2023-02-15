public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int investment = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + investment;
            month += 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int k = 10; k >= 1; k--) {
            System.out.print(k + " ");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthratePerThousand = 17;
        int mortalityPerThousand = 8;
        for (int i = 1; i <=10; i++) {
            population = population + (population/1000 * birthratePerThousand) - (population/1000 * mortalityPerThousand);
            System.out.println("Год " + i + ", численность населения составляет " + population + " человек.");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int amountOfSavings = 15000;
        int ratePerHundred = 7;
        int month = 0;
        while (amountOfSavings < 12000000) {
            amountOfSavings = amountOfSavings + (amountOfSavings * ratePerHundred / 100);
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений составляет " + amountOfSavings + " рублей.");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int amountOfSavings = 15000;
        int ratePerHundred = 7;
        int month = 0;
        while (amountOfSavings < 12000000) {
            amountOfSavings = amountOfSavings + (amountOfSavings * ratePerHundred / 100);
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + amountOfSavings + " рублей.");
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int amountOfSavings = 15000;
        int ratePerHundred = 7;
        int years = 9;
        int month = 12 * years;
        for (int i = 1; i <= month; i++) {
            amountOfSavings = amountOfSavings + (amountOfSavings * ratePerHundred / 100);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений составляет " + amountOfSavings + " рублей.");
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 2;
        for (; friday <=31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int year = 0;
        int startingYear = 2023 - 200;
        while (year < 2123) {
            year = year + 79;
            if (year > startingYear && year <= 2123) {
                System.out.println(year);
            }
        }
    }
}