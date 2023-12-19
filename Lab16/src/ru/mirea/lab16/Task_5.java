package ru.mirea.lab16;

public class Task_5 {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public void printMessageSafe(String key) {
        String message = getDetailsSafe(key);
        System.out.println(message);
    }

    public String getDetailsSafe(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetailsSafe");
            }
            return "data for " + key;
        } catch (NullPointerException e) {
            key = "default";
            return "data for " + key;
        }
    }

    public static void main(String[] args) {
        Task_5 task = new Task_5();

        task.printMessageSafe("Key");
        task.printMessageSafe(null);

        task.printMessage("Key");
        task.printMessage(null);
    }
}
