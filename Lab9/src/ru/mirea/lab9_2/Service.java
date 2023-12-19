package ru.mirea.lab9_2;

class Service implements Priceable {
    private String serviceName;
    private double hourlyRate;

    public Service(String serviceName, double hourlyRate) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice() {
        // Для услуги можно вернуть общую стоимость
        // на основе часовой ставки и времени
        int hours = 2; // Примерное количество часов
        return hourlyRate * hours;
    }

    @Override
    public String toString() {
        return serviceName + " - $" + getPrice(); // getPrice() используется здесь
    }
}
