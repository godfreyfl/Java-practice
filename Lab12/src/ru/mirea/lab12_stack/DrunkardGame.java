package ru.mirea.lab12_stack;

import java.util.Stack;

public class DrunkardGame{
    Stack<Integer> fp, sp; // Две колоды карт

    public DrunkardGame(String fp, String sp) { // Конструктор
        this.fp = new Stack<>();
        this.sp = new Stack<>();
        for(int i = 4; i >= 0; i --){
            this.fp.push(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.push(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item){ // Метод, который добавляет элемент item в конец стека s
        Stack<Integer> ns = new Stack<>(); // Временный стек для обратного порядка элементов перед добавлением нового элемента
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }

    public String play(){ // Метод, реализующий игровой процесс
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count <= 106){ // Игра продолжается, пока не закончится одна из колод или не будет сделано более 106 ходов
            if(fp.peek() > sp.peek() && sp.peek() != 0){ // Сравнение верхних карт двух колод в каждом ходе
                pushBack(fp, fp.pop());
                pushBack(fp, sp.pop()); // Перемещение карт в конец победившей колоды
            }else{
                pushBack(sp, fp.pop());
                pushBack(sp, sp.pop());
            }
            count++;
        }
        String res = "";
        if(fp.isEmpty()) res += "second ";
        else res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res; // резульат с победителем и количеством ходов
    }

    public static void main(String[] args) {
        System.out.println("колода 1: 13579; колода 2: 24680");
        System.out.println(new DrunkardGame("13579", "24680").play());
    }

}


