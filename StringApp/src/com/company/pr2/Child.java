package com.company.pr2;
//Задание выполнять в отдельной ветке!!!
//
//Описать класс «Ученик» с произвольными полями 4 типов,
//создать 3 метода(2 публичных и 1 приватный):
//первый публичный «Отвечать у доски» в этом методе вызвать уже приватный метод
//«Подготовиться к ответу. И ещё один приватный «Кушать».
//Во всех методах просто вывести в консоль то, что делаете(пример:
//В методе кушать вывести «Я кушаю») .
//Самое главное это правильно расставить модификаторы доступа и создать
//соответствующие методы для для работы с данными (геттеры/сеттеры).
//Хотя бы в одном сеттере обработайте ввод (если возраст меньше нуля или пустое имя).
//Создайте отдельный класс в другом пакете,
//создайте объект класса ученик и вызовите на нём методы,
//в комментариях к коду написать почему приватный метод не доступен
//Создать push-request!!! Инструкция в конце 2-го видео

class Program{

    public static void main(String[] args) {

        Person I = new Person("Yura", 19, "Sumy Street", "+12334567");
        I.displayName();     // метод public
        I.displayAge();      // метод имеет модификатор по умолчанию
        I.displayPhone();    // метод protected

        System.out.println(I.name);      // модификатор по умолчанию
        System.out.println(I.address);   // модификатор public
        System.out.println(I.age);       // модификатор protected
    }
}
class Person{

    String name;
    protected int age;
    public String address;
    private String phone;

    public Person(String name, int age, String address, String phone){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }
    public void displayName(){
        System.out.printf("Name: %s \n", name);
    }
    void displayAge(){
        System.out.printf("Age: %d \n", age);
    }
    private void displayAddress(){
        System.out.printf("Address: %s \n", address);
    }
    protected void displayPhone(){
        System.out.printf("Phone: %s \n", phone);
    }}