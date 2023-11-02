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

        StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));

        String firstSubstring = stringBuilder.substring(0, 3);
        System.out.println("firstSubstring: " + firstSubstring);
        String secondSubstring = stringBuilder.substring(3, 6);
        System.out.println("secondSubstring: " + secondSubstring);


        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += Character.getNumericValue(firstSubstring.charAt(i));
            sum2 += Character.getNumericValue(secondSubstring.charAt(i));

        }

        if (sum1 == sum2) {
            System.out.println("У Вас счастливое число!");
        } else {
            System.out.println("У Вас несчастливое число!");
        }

    }

    //Task6
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вычисление факториала\nВведите положительное число ");

        int number = Integer.parseInt(scanner.next());

        int result = 1;

        if (number == 0) {
            result = 1;
        }
        for (int i = 1; i < number; i++) {
            result = result * i;
        }
        System.out.println("Факториал от " + number + ": " + result);
    }

}
