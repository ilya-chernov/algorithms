import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci {
    public static int FibonacciNaive(int number) {
        if (number <= 2) {
            return 1;
        } else {
            return FibonacciNaive(number - 1) + FibonacciNaive(number - 2);
        }
    }

    static HashMap<Integer, Integer> hashMap = new HashMap<>();
    public static int FibonacciSmart(int n) {
        if (n <= 2) {
            return 1;
        }

        if (hashMap.get(n) != null) {
            return hashMap.get(n);
        } else {
            int value = FibonacciSmart(n - 1) + FibonacciSmart(n - 2);
            hashMap.put(n, value);
            return hashMap.get(n);
        }
    }


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); // инициализируем объект console типа scanner

        System.out.println("Нахождение числа Фибоначчи. Выберите алгоритм");
        System.out.println("1 - Наивный. Дохнет при числах покрупнее");
        System.out.println("2 - С кешированием. Вычисления сохраняются в HashMap");
        System.out.print("Введите число с клавиатуры: ");

        int option = console.nextInt();

        if (option == 1) {
            System.out.print("Выбран 1 алгоритм. Введите число с клавиатуры: ");
            int number = console.nextInt();
            String response = String.format("f(%s) = ", number);
            System.out.println(response + FibonacciNaive(number));
        }

        if (option == 2) {
            System.out.print("Выбран 2 алгоритм. Введите число с клавиатуры: ");
            int number = console.nextInt();
            String response = String.format("f(%s) = ", number);
            System.out.println(response + FibonacciSmart(number));
        }

        if ((option != 1) && (option != 2)) {
            System.out.println("Неверный вариант меню.");
        }

    }
}