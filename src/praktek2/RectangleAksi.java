package praktek2;

public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle rl = new Rectangle();
        rl.Harga_sapi = 1500000;
        rl.Jumlah_beli = 4;
        
        rl.cetakInfo();
        System.out.println("Total Rectangle ="+rl.hitungTotal());
        rl.cetakTotal();
        
    }
 
}
