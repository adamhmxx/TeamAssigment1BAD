class PerhitunganBahanBaku {
protected String namaBahan;

public PerhitunganBahanBaku(String namaBahan) {
this.namaBahan = namaBahan;
}

public void hitungBahan(int tepung, int telur, int gula) {
System.out.println("Perhitungan komposisi bahan untuk " + namaBahan + ":");
System.out.println("Tepung Terigu: " + tepung + " Gram");
System.out.println("Telur : " + telur + " Butir");
System.out.println("Gula : " + gula + " Gram");
}
}

// Subclass
class PerhitunganBahanKue extends PerhitunganBahanBaku {
public PerhitunganBahanKue(String namaBahan) {
super(namaBahan);
}

@Override
public void hitungBahan(int tepung, int telur, int gula) {
super.hitungBahan(tepung, telur, gula);
int jumlahKue = (tepung * telur * gula) / 800; // 800 gram jumlah bahan untuk 1 kuenya
System.out.println("Jumlah kue yang berhasil dibuat: " + jumlahKue);
}
}

// Subclass
class PerhitunganBahanBolu extends PerhitunganBahanBaku {
public PerhitunganBahanBolu(String namaBahan) {
super(namaBahan);
}

public void hitungBahan(int tepung, int telur, int gula) {
super.hitungBahan(tepung, telur, gula);
int jumlahBolu = (tepung * telur * gula) / 800; // 800 gram jumlah bahan untuk 1 kuenya
System.out.println("Jumlah bolu yang berhasil dibuat " + jumlahBolu);
}
}

// Main class
public class Main {
public static void main(String[] args) {
PerhitunganBahanKue kue = new PerhitunganBahanKue("Kue Cookies");
kue.hitungBahan(100, 5 , 100);

PerhitunganBahanBolu bolu = new PerhitunganBahanBolu("Bolu Manis");
bolu.hitungBahan(120, 6, 120);
}
}