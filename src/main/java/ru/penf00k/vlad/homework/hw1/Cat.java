package ru.penf00k.vlad.homework.hw1;

public class Cat extends MovingAnimal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "вай какая девушка";
    }
}
