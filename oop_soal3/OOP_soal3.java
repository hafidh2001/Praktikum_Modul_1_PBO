package oop_soal3;

import java.util.Scanner;

public class OOP_soal3 {

    public static void main(String[] args) {
        //deklarasi global
        String t, w, d;
        int bp, y;
	int n = 0;
        double sell;
        
	Scanner data = new Scanner(System.in);
	
        NovelCollection[] obj = new NovelCollection[3];
		
	System.out.println("Silahkan input data novel");
	while(n<3){
            int i = n+1;
            System.out.println("Data ke-" + i);
			
            System.out.print("Title: ");
            t = data.nextLine();
            System.lineSeparator();
			
            System.out.print("Writer: ");
            w = data.nextLine();
            System.lineSeparator();
		
            System.out.print("Descriptions: ");
            d = data.nextLine();
            System.lineSeparator();
			
            System.out.print("Years Out: ");
            y = data.nextInt();
            System.lineSeparator();
			
            System.out.print("Bought Price: ");
            bp = data.nextInt();
            System.lineSeparator();	
            
            System.out.println("\n");
            
            
            //harga jual
            sell = bp - (0.2 * bp);
            
            obj[n] = new NovelCollection(t, w, d, y, bp, sell);
            n++;  
        }
                
	System.out.println("Data Yang Ditampilkan :");
	System.out.println("----------------------------------\n");
	
        for(int z = 0; z < 3; z++) {
            obj[z].showItemData();
	}
    }
    
}
