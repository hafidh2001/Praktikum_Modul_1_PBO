package oop_soal3;

public class NovelCollection {
    //deklarasi variabel global
    public String title;
    public String writer;
    public String desc;
    public int year, buyPrice, sellPrice;
    public double sell;
    
    //constructor
    public NovelCollection(String t, String w, String d, int y, int bp, double sell){
	this.title = t;
	this.writer = w;
	this.desc = d;
        this.year = y;
	this.buyPrice = bp;
        this.sell = sell;
    }
	
    void showItemData() {
	System.out.println("Judul: " + this.title);
	System.out.println("Pengarang: " + this.writer);
	System.out.println("Deskripsi_cerita: " + this.desc);
	System.out.println("Tahun Beli: " + this.year);
	System.out.println("Harga_Beli: " + this.buyPrice);
        System.out.println("Harga_jual: " + this.sell);
        
        System.out.println("\n");
    }
    
	
}
