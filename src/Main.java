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
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();


    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        for (int i = 10; i >= 0; i = i - 1) {
            System.out.println("Итерация цикла в обратном направлении " + i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Итерация цикла четных чисел " + i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("Итерация цикла чисел " + i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Все високосные года " + i);
        }

    }

    public static void task6() {
        System.out.println("Задача 6");

        for (int i = 0; i <= 98; i = i + 7) {
            System.out.println("Последовательность чисел " + i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Последовательность чисел " + i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int sum = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);

    }

    public static void task9() {
        System.out.println("задача 9");
        int sum = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = sum + total;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);

    }

    public static void task10() {
        System.out.println("Задача 10");
        int multiplier = 2;
        for (int number = 1; number <= 10; number++) {
            int result = multiplier * number;
            System.out.println(multiplier + "*" + number + "=" + result);
        }
    }

    public static void task11() {
        System.out.println("Задача 1");
        int moneyNeed = 2_459_000;
        int total = 0;
        int readyToPostpone = 15_000;
        int month = 1;
        while (total < moneyNeed) {
            total = total + readyToPostpone;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
    }

    public static void task12() {
        System.out.println("Задача 2");
        int number = 1;
        int max = 10;
        while (number <= max) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }
    }

    public static void task13() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int coef = 1_000;
        int fertility = 17;
        int mortality = 8;
        int years = 10;
        int difference = fertility - mortality;
        for (int year = 1; year <= years; year++) {
            population = population + population * difference / coef;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task14() {
        System.out.println("Задача 4");
        int total = 15_000;
        int moneyNeed = 12_000_000;
        int month = 1;
        double percent = 0.07;
        while (total <= moneyNeed) {
            total = total + (int) (total * percent);
            System.out.println("Сумма накоплений за месяц " + month + ", равна " + total);
            month++;
        }
    }

    public static void task15() {
        System.out.println("Задача 5");
        int total = 15_000;
        int moneyNeed = 12_000_000;
        int month = 1;
        double percent = 0.07;
        while (total <= moneyNeed) {
            total = total + (int) (total * percent);
            if (month % 6 == 0) {
                System.out.println("Сумма накоплений за месяц " + month + ", равна " + total);
            }
            month++;
        }


    }

    public static void task16() {
        System.out.println("Задача 6");
        int total = 15_000;
        int months = 9 * 12;
        double percent = 0.07;
        for (int month = 1; month <= months; month++) {
            total = total + (int) (total * percent);
            if (month % 6 == 0) {
                System.out.println("Сумма накоплений за месяц " + month + ", равна " + total);
            }

        }

    }

    public static void task17() {
        System.out.println("Задача 7");
        int friday = 6;
        for (int everyFriday = friday; everyFriday <= 31; everyFriday = friday += 7) {
            System.out.println("Сегодня пятница, " + everyFriday + "-е число. Необходимо подготовить отчет");
        }

    }

    public static void task18() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;
        int period = 79;
        int firstComet = 0;
        for (int year = firstComet; year <= end; year +=period) {
            if (year >= start) {
                System.out.println(year);
            }
        }


    }
}