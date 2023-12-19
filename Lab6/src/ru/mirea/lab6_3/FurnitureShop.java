package ru.mirea.lab6_3;

// Класс, представляющий магазин мебели
class FurnitureShop {
    private ru.mirea.lab6_3.Furniture[] inventory;

    public FurnitureShop(int capacity) {
        inventory = new ru.mirea.lab6_3.Furniture[capacity];
    } // вместимость магазина

    public void addFurniture(ru.mirea.lab6_3.Furniture item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) { // условие, свободно ли место для мебели
                inventory[i] = item;
                System.out.println(item.getName() + " добавлен в магазин.");
                return;
            }
        }
        System.out.println("Магазин полон, невозможно добавить " + item.getName());
    }

    public void listInventory() {
        System.out.println(" ");
        System.out.println("Инвентарь магазина:");
        for (ru.mirea.lab6_3.Furniture item : inventory) {
            if (item != null) {
                item.displayInfo();
                System.out.println("--------------------");
            }
        }
    }
}


