package ru.mirea.lab22_1;

// Объявление класса ConcreteFactory, который реализует интерфейс ComplexAbstractFactory
public class ConcreteFactory implements ComplexAbstractFactory {

    // Реализация метода создания комплексного числа без параметров
    @Override
    public Complex createComplex() {
        // Создание и возвращение нового объекта Complex без заданных параметров
        return new Complex();
    }

    // Реализация метода создания комплексного числа с заданными вещественной и мнимой частью
    @Override
    public Complex createComplex(int real, int imag) {
        return new Complex(10, 5);
    }
}
