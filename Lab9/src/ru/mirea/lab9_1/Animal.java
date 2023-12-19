package ru.mirea.lab9_1;

// Класс, представляющий животное
class Animal implements Nameable {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    @Override
    public String getName() {
        return species;
    }
}
