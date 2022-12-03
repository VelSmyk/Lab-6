package variant3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();
        MatchInterface match1 = new CoprimeNumbers();
        MatchInterface match2 = new NumberComprasion();
        System.out.println("Сравнение двух чисел : " + match2.match(number1,number2));
        System.out.println("Взаимно простые числа :" + match1.match(number1,number2));
    }
}
