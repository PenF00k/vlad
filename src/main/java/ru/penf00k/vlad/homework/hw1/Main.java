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
        // TODO Вывести в цикле инфу обо всех животных вида "Чарли ходит и говорит гав". Чтобу узнать, сколько элементов хранится, вызови animals.size()
    }

    private static void addAnimal(Animal animal) {
        animals.add(animal);
    }

    private static Animal getAnimal(int index) {
        return animals.get(index);
    }
}
