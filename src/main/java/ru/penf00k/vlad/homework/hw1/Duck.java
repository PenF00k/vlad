package ru.penf00k.vlad.homework.hw1;

public class Duck extends FlyingAnimal {

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "жизнь боль";
    }
}
