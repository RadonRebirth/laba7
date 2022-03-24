package com.company;

import java.util.Scanner;

class Animal {
    String name;
    String food;
    String location;
    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }
}
class Cat extends Animal {
    public Cat(String name, String food, String location) {
        super(name, food, location);
    }
}
class Dog extends Animal {
    public Dog(String name, String food, String location)
    {
        super(name, food, location);
    }
}
class Horse extends Animal {
    public Horse(String name, String food, String location) {
        super(name, food, location);
    }
}
class Veterinar{
    public void treatAnimal(Animal animal){
        System.out.println("\nИнформация о пациенте:");
        System.out.println("на приёме у ветеринара сейчас " + animal.name);
        System.out.println("Имя питомца: " + animal.name +  "\nПредпочитаемое питание: " + animal.food  + "\nПоследнее место нахождение: " + animal.location);
        System.out.print("");
    }
}
public class Main {
    public static void main(String[] args) {
        Veterinar vet = new Veterinar();
        Scanner in = new Scanner(System.in);
        System.out.println("Как зовут котёнка: ");
        String name = in.nextLine();
        Cat cat = new Cat(name,"Кошачий корм","Дома на кроватке");
        vet.treatAnimal(cat);
        System.out.println(" ");
        System.out.println("Как зовут собачку: ");
        name = in.nextLine();
        Dog dog = new Dog(name, "Собачий корм","Во дворе в будке");
        vet.treatAnimal(dog);
        System.out.println(" ");
        System.out.println("Как зовут лошадь: ");
        name = in.nextLine();
        Horse horse = new Horse(name,"Яблоко","В загоне на конюшне");
        vet.treatAnimal(horse);
    }
}
