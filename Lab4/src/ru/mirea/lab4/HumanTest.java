package ru.mirea.lab4;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Блонд", 7);
        Hand leftHand = new Hand(5, true);
        Hand rightHand = new Hand(5, false);
        Leg leftLeg = new Leg(5);
        Leg rightLeg = new Leg(5);

        Human person = new Human(head, leftHand, rightHand, leftLeg, rightLeg);

        person.displayInfo();
    }
}
