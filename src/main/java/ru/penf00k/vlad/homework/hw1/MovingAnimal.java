package ru.penf00k.vlad.homework.hw1;

public abstract class MovingAnimal extends Animal {

    public MovingAnimal(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "еле ноги волочит";
    }
}
