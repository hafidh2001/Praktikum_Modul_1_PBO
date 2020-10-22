package oop_soal1;

import java.util.Scanner;

public class Bilangan {
    Scanner keyboard = new Scanner(System.in);
    public int bill;

    //Constructor
    public Bilangan() {
        System.out.println("GANJIL_GENAP & POSITIF_NEGATIF\n");
        
        System.out.print("Masukkan angka: ");
        bill = keyboard.nextInt();
        System.lineSeparator();
    }
    
    //Method
    void checkLessGre() {
        if(bill>=0) {
            System.out.println(bill +" = Bilangan Positif");
        } else {
            System.out.println(bill +" = Bilangan Negatif");
        }
    }
    //Method
    void checkEvenOdd() {
        if(bill%2==0) {
            System.out.println(bill +" = Bilangan Genap");
        } else {
            System.out.println(bill +" = Bilangan Ganjil");
        }
    }
    //Pembungkus Method
    void check_all() {
        checkLessGre();
        checkEvenOdd();
    }

}
