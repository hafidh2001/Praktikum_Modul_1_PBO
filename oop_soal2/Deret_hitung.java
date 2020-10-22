package oop_soal2;

import java.util.Scanner;

public class Deret_hitung {
    Scanner keyboard = new Scanner(System.in);
    public int nilai_awal;
    public int beda;
    public int total_bill;
    
    //Constructor
    public Deret_hitung() {
        System.out.print("DERET\n");
        
        System.out.print("Input Nilai awal: ");
        nilai_awal = keyboard.nextInt();
        System.lineSeparator();
    
        System.out.print("Input Beda: " );
        beda = keyboard.nextInt();
        System.lineSeparator();
        
        System.out.print("Total Deret yang diminta : ");
        total_bill =  keyboard.nextInt();
        System.lineSeparator();
    }
    
    //Method
    void rumus() {
        int hasil;
        hasil = nilai_awal;
        int jum;
        jum = nilai_awal;
        
        double rata_rata;
       
        for(int i=1; i<=total_bill; i++) {
            if (i==total_bill) {
                System.out.print(hasil +" \n");
            } else {
                System.out.print(hasil +" ");
                
                hasil = hasil + beda;
                jum = jum + hasil;
            }
        }
        
        rata_rata = jum / total_bill;
        
        System.out.println("Hasil Jumlah bilangan: "+ jum);
        System.out.println("Rata_rata bilangan: "+ rata_rata);
    }
 
       
}
