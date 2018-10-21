package ru.penf00k.vlad.homework.hw1;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public abstract String say(); // Возвращает слово, которое говорит: кря, мяу, гав и т.д.
    public abstract String move(); // Возвращает слово, как передвигается: ходит, плавает, летает и т.д.
}
