import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Task2 {


    public static double equal(double x) {

        return 7 * Math.pow(x, 2) + 3 * x + 6;
    }

    public static void main(String[] args) {
        System.out.println("S1.1 \nВывести на экран число с точностью до сотых");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        double N = in.nextDouble();
        System.out.printf("%.2f\n", N);
        System.out.println("S1.2 Вывести на экран число e (основание натурального логарифма) с точностью до \n" +
                "десятых");
        double n = 0.00000007891;
        System.out.printf("%.1f\n", n);

        System.out.println("S1.3 \nСоставить программу вывода на экран числа, вводимого с клавиатуры. \n" +
                "Выводимому числу должно предшествовать сообщение «Вы ввели число».\n");
        Scanner In = new Scanner(System.in);
        System.out.println("Введите число");

        n = In.nextDouble();
        System.out.println("Вы ввели число");
        System.out.println(n);
        System.out.println("S1.5.\nВывести на одной строке числа 1, 13 и 49 с одним пробелом между ними");
        System.out.println("1 13 49");
        System.out.println("S1.6.\nВывести на одной строке числа 7, 15 и 100 с двумя пробелами между ними");
        System.out.println("7  15  100");
        System.out.println("S1.7.\n Составить программу вывода на экран в одну строку трех любых чисел с двумя \n" +
                "пробелами между ними");
        System.out.println("Введите три числа");
        int a = In.nextInt();
        int b = In.nextInt();
        int c = In.nextInt();
        System.out.println(a + "  " + b + "  " + c);
        System.out.println("S1.8.\nСоставить программу вывода на экран в одну строку четырех любых чисел с \n" +
                "одним пробелом между ними.");
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
        c = r.nextInt(10);
        int d = r.nextInt(10);
        System.out.println(a + "  " + b + "  " + c + "  " + d);
        System.out.println("S1.9.\nВывести на экран числа 50 и 10 одно под другим.");
        System.out.println("50\n10");
        System.out.println("S1.10.\nВывести на экран числа 5, 10 и 21 одно под другим");
        System.out.println("50\n10\n 21");
        System.out.println("S2.1. Составить программу:  вычисления значения функции y=7x2+3x+6 при любом значении x;");
        System.out.println("Введите x");
        System.out.println(equal(In.nextDouble()));
        System.out.println("Дана сторона квадрата. Найдите периметр");
        a = 4;
        System.out.println("Периметр квадрата" + a * 4);
        System.out.println("Дан радиус окружности. Найти ее диаметр. — решение");
        b = 2;
        System.out.println("Диаметр окружности" + b * 2);
        System.out.println(" S2.5.\n Дана длина ребра куба. Найти объем куба и площадь его боковой \n" +
                "поверхности. — решение");
        System.out.println("Обьем куба" + Math.pow(a, 3));
        System.out.println("Площадь поверхности" + 4 * a * a);
        System.out.println("S2.6.\n Дан радиус окружности. Найти длину окружности и площадь круга.");
        c = 2;
        final double pi = 3.14;
        System.out.println("Длина окружности" + 2 * pi * c);
        System.out.println("Площадь круга" + pi * c * c);
        System.out.println("S2.7. Даны два целых числа. Найти: а) их среднее арифметическое; б) их среднее геометрическое");
        System.out.println("Среднее арифметическое" + (a + b) / 2);
        System.out.println("Среднее геометрическое" + (a * b) / 2);
        System.out.println("S2.8.\n Известны объем и масса тела. Определить плотность материала этого тела.");
        double m = 2;
        double v = 4;
        System.out.println("Плотность тела-" + m / v);
        System.out.println("Известны количество жителей в государстве и площадь его \n" +
                "территории. Определить плотность населения в этом государстве.");
        m = 146447424;
        v = 17098246;
        System.out.println("Площадь России" + v);
        System.out.println("Колво проживающиъ" + m);
        System.out.println("Плотность населения " + m / v);
        System.out.println("S2.10.\n Составить программу решения линейного уравнения ax+b=0 (a ≠ 0).");
        System.out.println("Введите а");
        a = in.nextInt();
        System.out.println("Введите b");
        b = in.nextInt();
        System.out.println("Решения уравнения x=" + (-b / a));
        System.out.println("S2.11.\n Даны катеты прямоугольного треугольника. Найти его гипотенузу.");
        a = 2;
        b = 4;
        System.out.println("Гипотенуза=" + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println("S2.13.\n Даны катеты прямоугольного треугольника. Найти его периметр.");
        System.out.println("Периметр треугольника" + a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println();


    }
}




