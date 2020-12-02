package com.company.pr2;

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