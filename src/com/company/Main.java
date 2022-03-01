package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите количество дней для подсчёта: ");
        int days=new Scanner(System.in).nextInt();

        convert(days);

    }
    static void convert(int days){
        if(days<=0) throw new IllegalArgumentException();
        System.out.println("В "+ days+" днях: "+ days*24 + " часов, "+ days*1440 +" минут, "+ days*86400+" секунд.");

    }
    }

