package Task_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        task5();


    }

    public static void task1() {
        //Task1
        System.out.println("Fall seven times\nand\nstand up eight");
    }

    public static void task2() {
        //Task2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разница: " + (a - b));
        System.out.println("Произведение: " + (a * b));
        if (b != 0) {
            System.out.println("Частное " + (double) (a / b));
        } else {
            System.out.println("На ноль делить нельзя!");
        }

        scanner.close();
    }

    public static void task3() {
        //Task 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
        System.out.println(stringBuilder.reverse());
        scanner.close();
    }

    public static void task4() {
        System.out.println("Введите кол-во часов (от 0 до 24)");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        if (hours > 0 && hours < 6) {
            System.out.println("Good night");
        }
        if (hours > 6 && hours < 13) {
            System.out.println("Good morning");
        }
        if (hours > 13 && hours < 17) {
            System.out.println("Good Day");
        }
        if (hours > 17 && hours < 24) {
            System.out.println("Good Evening");
        }
    }

    public static void task5() {
        System.out.println("Введите шестизначное число");
        Scanner scanner = new Scanner(System.in);

        String number = scanner.next();
        System.out.println("Number: " + number);

        if (number.length() != 6) {
            System.out.println("Вы ввели не шестизначное число");

        }

                int[] digits = new int[6];

        for (int i = 0; i < number.length(); i++) {

            digits[i] = Integer.parseInt()
        }



//        StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
//
//        StringBuilder first = stringBuilder.delete(3,6);
//        int number1 = Integer.parseInt(String.valueOf(first));
//        System.out.println("Number1: " + number1);
//        StringBuilder second = stringBuilder.delete(0, 3);
//        int number2 = Integer.parseInt(String.valueOf(second));
//        System.out.println("Number2: " + number2);
//
////        System.out.println(first);
//        System.out.println(second);

    }

}
