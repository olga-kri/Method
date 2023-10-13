public class Main {
    // метод для задачи 1
    public static void defineYear(int year) {
        String msg1 = "%d год является високосным \n";
        String msg2 = "%d год не является високосным \n";
        if (year < 1584) {
            System.out.println("Високосный год был введен в 1584, поэтому все предшествующие года не могут считаться високосными или не високосными.");
        } else if (year % 4 != 0) {
            System.out.printf(msg2, year);
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.printf(msg2, year);
        } else {
            System.out.printf(msg1, year);
        }
    }

    // Метод для задачи 2
    public static void defineOS(byte oS, int year) {
        if (year >= 2015) {
            switch (oS) {
                case 0: System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1: System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        } else if (year < 2015) {
            switch (oS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        }
    }

// Метод для задачи 3
       public static int defineDay(int i){
           int day = 0;
           if (i < 20) {
               day += 1;
           } else if (i >= 20 && i < 60) day = day + 2;
           else if (i >= 60 && i < 100) day = day + 3;
           return day;
       }
       public static void main (String[]args){

           // Задача 1: Оберните проверку в программе на високосный год в метод
           int years = 2024;
           defineYear(years);

           // Задача 2: Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
           byte clientOS = 0;
           int clientDeviceYear = 2015;
           defineOS(clientOS, clientDeviceYear);

           // Задача 3: написать метод, который на вход принимает дистанцию и возвращает количество дней доставки.

           int distance = 95;
           defineDay(distance);
           int days = defineDay(distance);
           if (days != 0) {
               System.out.println("Для доставки потребуется дней: " + days);
           } else {
               System.out.println("Доставка в ваш регион невозможна.");
           }



    }
}