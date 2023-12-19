package ru.mirea.lab16;

import java.util.Scanner;

public class Task_8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);

        boolean incor = false;
        do {
            incor = false;
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try{
                printDetails(key);
            }catch (Exception e){
                incor = true;
            }
        }while (incor);
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Task_8 task = new Task_8();
        try {
            task.getKey();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
