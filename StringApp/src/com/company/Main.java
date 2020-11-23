package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Написать программу в которой Пользователь сначала вводит своё имя,
// В ответ ему возвращается его имя наоборот.
//
// Потом вводит возраст,
// если возраст меньше  0 то вывести «Возраст не может быть отрицательным»,
// если между 0 и 18 вывести «Делай уроки», если больше 18 вывести «Езжай в Польшу на клубнику».
//
// Потом вводит 5 любых чисел из них найти наибольшее и наименьшее.
//
//!!!  Реверс имени(возвращает строку), вычисление наибольшего и наименьшего чисел
// (две функции которые на вход принимают массив чисел и возвращают мин и макс значение),
// вывод сообщения в зависимости от возраста(ничего не возвращает, а только печатает)
// — вынести в отдельные методы

public class Main {

    public static void main(String[] args) {
        //name reverse
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        String reverse = new StringBuffer(name).reverse().toString();
        System.out.println("Имя в обратном порядке: " + reverse);

        // age
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным");
        } else if (age < 18) {
            System.out.println("Иди делай уроки");
        } else if (age >= 18) {  // в 18 уже можно на клубнику)
            System.out.println("Езжай в Польщу на клубнику стрик");
        }

        //5 numbers
        Scanner numb = new Scanner(System.in);
        // пользователь вводит 5 чисел
        System.out.println("Введите 5 чисел :");
        int a = numb.nextInt();
        int b = numb.nextInt();
        int c = numb.nextInt();
        int d = numb.nextInt();
        int f = numb.nextInt();

        // создаем списочный массив
        ArrayList numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        numbers.add(f);

        // используем методы max и min
        System.out.println("Наибольшое число: " + Collections.max(numbers));
        System.out.println("Наименьшее число: " + Collections.min(numbers));

    }
}
