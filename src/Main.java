public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

            }
    public static void task1() {
        System.out.println("Task 1");
         int clientOS = 1;
         if (clientOS == 0) {
             System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
             System.out.println("Установите версию приложения для Android по ссылке");
         }
    }
    public static void task2() {
        System.out.println("Task 2");
        int clientOS = 1;
        int deviceYear = 2012;
        if (clientOS == 0) {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientOS == 1) {
                if (deviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке ");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }
    }
    public static void task3() {
        System.out.println("Task 3");
        int year = 2002;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4() {
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance  < 20) {
            System.out.println("Потребуется дней "+day);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней "+ (day+1));
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней "+ (day+2));
        } else System.out.println("Доставка невозможна");
    }
    public static void task5() {
        System.out.println("Task 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Невозможно определить значение");
        }
    }
}
