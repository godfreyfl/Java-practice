package ru.mirea.lab4;

class Human {
    private Head head;
    private Hand leftHand;
    private Hand rightHand;
    private Leg leftLeg;
    private Leg rightLeg;

    public Human(Head head, Hand leftHand, Hand rightHand, Leg leftLeg, Leg rightLeg) {
        this.head = head;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    public void displayInfo() {
        System.out.println("Информация о человеке:");
        System.out.println("Цвет волос: " + head.getHairColor());
        System.out.println("Количество родинок: " + head.getMoleCount());
        System.out.println("Количество пальцев на левой руке: " + leftHand.getFingerCount());
        System.out.println("Наличие шрама на левой руке: " + leftHand.hasThumb());
        System.out.println("Количество пальцев на правой руке: " + rightHand.getFingerCount());
        System.out.println("Наличие шрама на правой руке: " + rightHand.hasThumb());
        System.out.println("Количество пальцев на левой ноге: " + leftLeg.getToeCount());
        System.out.println("Количество пальцев на правой ноге: " + rightLeg.getToeCount());
    }
}
