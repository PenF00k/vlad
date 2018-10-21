package ru.penf00k.vlad.homework.hw1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        // TODO Сделать класс Dog - наследника от MovingAnimal
        // TODO Добавлять животных через метод addAnimal, брать животных через метод getAnimal(индекс в цикле)
        // TODO Добавить всех наших собак
        // TODO Добавить пару кошек
        // TODO Добавить 48 птиц с именами вида "Птица 1", "Птица 2"
        // TODO Проверить, что все животные правильно передвигаются и говорят
        // TODO Вывести в цикле инфу обо всех животных вида "Чарли ходит и говорит гав"

        addAnimal(new Cat("Барсик"));
        addAnimal(new Duck("Птица 1"));

        for (int i = 0; i < animals.size(); i++) {
            Animal animal = getAnimal(i);
            System.out.printf("%s %s и говорит \"%s\"\n", animal.getName(), animal.move(), animal.say());
        }
    }

    private static void addAnimal(Animal animal) {
        animals.add(animal);
    }

    private static Animal getAnimal(int index) {
        return animals.get(index);
    }
}
