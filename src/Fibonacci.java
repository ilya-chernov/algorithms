import java.util.Scanner;

public class Fibonacci {
    public static int FibonacciNaive(int number) {
        // наивный подход. Сложность n^2 - жутко не оптимальный вариант
        if (number <= 2) {
            return 1;
        } else {
            return FibonacciNaive(number - 1) + FibonacciNaive(number - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Нахождение числа Фибоначчи.");
        System.out.print("Введите число с клавиатуры: ");
        Scanner console = new Scanner(System.in); // инициализируем объект console типа scanner
        int number = console.nextInt();

        String response = String.format("f(%s) = ", number);
        System.out.println(response + FibonacciNaive(number));
    }
}