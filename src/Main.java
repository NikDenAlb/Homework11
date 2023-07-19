public class Main {
    public static boolean checkLeapYear(int year) {
        boolean IsleapYear;
        if (year % 400 == 0) {
            IsleapYear = true;
            return IsleapYear;
        } else if (year % 4 == 0 && year % 100 != 0) {
            IsleapYear = true;
            return IsleapYear;
        } else IsleapYear = false;
        return IsleapYear;
    }

    public static void printAppSuggestion(byte clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int deliveryDays(int deliveryDistance) {
        byte deliverTime = 0;
        deliverTime += 1;
        if (deliveryDistance > 20) {
            deliverTime += 1;
        }
        if (deliveryDistance > 60) {
            deliverTime += 1;
        }
        if (deliveryDistance > 100) {
            return -1;
        } else {
            return deliverTime;
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int yearForCheck = 2023;

        if (checkLeapYear(yearForCheck))
            System.out.println(yearForCheck + " год — високосный год");
        else System.out.println(yearForCheck + " год — невисокосный год");
    }

    public static void task2() {
        System.out.println("\nЗадача 2");

        byte clientOS = 1;
        int clientDeviceYear = 2020;

        printAppSuggestion(clientOS, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("\nЗадача 3");

        int deliveryDistance = 25;

        if (deliveryDays(deliveryDistance) == -1)
            System.out.println("Доставки нет");
        else System.out.println("Cрок доставки " + deliveryDays(deliveryDistance) + " день/дня/дней");
    }
}