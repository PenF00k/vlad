package ru.penf00k.vlad.homework.hw1;

public abstract class FlyingAnimal extends Animal {

    public FlyingAnimal(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "летает";
    }
}
