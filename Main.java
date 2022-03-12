package com.company;
public class Main {

    public static class Animal {
        Animal animal;
        public String name;
        public String food;
        public String location;

        public String setFood() {
            return food;
        }

        Animal(String name, String food, String location) {
            this.name = name;
            this.food = food;
            this.location = location;
        }
        public void eat() {
            System.out.println("жует \n кушает");
        }

        public void makeNoise() {
            System.out.println("шумит");
        }

        public void sleep() {
            System.out.println("спит");
        }

        public void displayInfo() {
            System.out.println("расположение: " + location);
            System.out.println("еда: " + food);
        }
    }

    static class Hourse extends Animal {
        private String minus = "Непосллушный";

        Hourse(String name, String food, String location) {
            super(name, food, location);
        }

        public void eat() {
            System.out.println("Конь кушает" + setFood());
        }

        public void makeNoise() {
            System.out.println("Конь ржёт");
        }

        public void sleep() {
            System.out.println("Конь спит");
        }

        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println("минус: " + minus);
        }
    }

    static class Cat extends Animal {
        private String minus = "Слишком ленивый";

        Cat(String name, String food, String location) {
            super(name, food, location);
        }

        public void eat() {
            System.out.println("Кот кушает" + setFood());
        }

        public void makeNoise() {
            System.out.println("Кот мурлычыт");
        }

        public void sleep() {
            System.out.println("Кот спит");
        }

        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println("минус: " + minus);
        }
    }

    static class Dog extends Animal {
        private String minus = "Слишком громкий";

        Dog(String name, String food, String location) {
            super(name, food, location);
        }

        public void eat() {
            System.out.println("Собака кушает" + setFood());
        }

        public void makeNoise() {
            System.out.println("Собака лает");
        }

        public void sleep() {
            System.out.println("Собачка спит");
        }

        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println("минус: " + minus);
        }
    }

    static class Veterinar {
        void treatAnimal(Animal animal) {
            System.out.print("\n еда: " + animal.food);
            System.out.println("\n расположение: " + animal.location);
            System.out.println(animal.name + " у Ветеринара");
        }
    }

    public static void main(String[] args) {
        Veterinar vet = new Veterinar();
        Animal cat = new Cat("Барсик", " китикет", "Дома на диване");
        Animal dog = new Dog("Рекс", " собачий корм", "Будка");
        Animal hourse = new Hourse("Искорка", " яблоко", "Конюшня");
        vet.treatAnimal(cat);
        cat.displayInfo();
        vet.treatAnimal(dog);
        dog.displayInfo();
        vet.treatAnimal(hourse);
        hourse.displayInfo();
    }
}