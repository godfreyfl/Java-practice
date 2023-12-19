package ru.mirea.lab6_3;

public class Main {
    public static void main(String[] args) {
        ru.mirea.lab6_3.FurnitureShop shop = new ru.mirea.lab6_3.FurnitureShop(5);

        ru.mirea.lab6_3.Chair chair1 = new ru.mirea.lab6_3.Chair("Стул с подлокотниками", 9000.0, 4);
        ru.mirea.lab6_3.Table table1 = new ru.mirea.lab6_3.Table("Обеденный стол", 5000.0, 6);
        ru.mirea.lab6_3.Chair chair2 = new ru.mirea.lab6_3.Chair("Кресло-качалка", 7500.0, 0);

        shop.addFurniture(chair1);
        shop.addFurniture(table1);
        shop.addFurniture(chair2);

        shop.listInventory();
    }
}


