import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа. Методы");
    int year = 2024;
    printInfoAboutYear(year);
    printInfoAboutVersion(1, 2022);
    int deliveryDistance = 54;
    int days = calculateDeliveryDays(deliveryDistance);
    if (days == -1) {
        System.out.println( " Доставка невозможна на расстоянии " + deliveryDistance +" км");}
    else {
        System.out.println( " Время доставки  " + days +" дней");
    }
    }
    private static void printInfoAboutYear(int year) {
        boolean leapYear = isLeapYear(year);
        if (leapYear) {
            System.out.println(year + " год является високосным ");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
        private static boolean isLeapYear( int year) {
        return year % 4 == 0 && year %100 != 0 || year %400 == 0;
        }
    private static void printInfoAboutVersion(int os, int productionYear) {
        if (os < 0 || os > 1) {
            System.out.println( "ОС должна быть равна 0 или 1!");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        StringBuilder result = new StringBuilder(" Установите");
        if (productionYear < currentYear) {
            result.append(" облегченную версию для ");
        }else {
            result.append(" версию для ");
        }
        if (os == 0) {
            result.append(" IOS ");
        } else {
            result.append(" ANDROID ");
        }
        System.out.println(result);
        }
        private  static int calculateDeliveryDays(int deliveryDistance){
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            return 1;
        }else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        }else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        }else {
            return -1;
        }
        }
    }


