package ru.mirea.lab6_2;

// Подкласс, представляющий кружку
class Mug extends Dish {
    private int volume;

    // Конструктор для создания объекта кружки
    public Mug(String material, String color, int volume) {
        super(material, color);
        this.volume = volume;
    }

    @Override
    public void use() {
        System.out.println("Наполните кружку напитком и выпейте.");
    }

    public int getVolume() {
        return volume;
    }
}

