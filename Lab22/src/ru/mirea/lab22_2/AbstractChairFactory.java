package ru.mirea.lab22_2;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicanChair();
    public FunctionalChair createFanctionalChair();
}
