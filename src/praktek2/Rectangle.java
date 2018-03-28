package praktek2;
public class Rectangle {
    Integer Harga_sapi;
    Integer Jumlah_beli;

    public Rectangle() {
        Harga_sapi= 2500000;
        Jumlah_beli= 2; 
    }

    public Rectangle(Integer Harga_sapi, Integer Jumlah_beli) {
        this.Harga_sapi = Harga_sapi;
        this.Jumlah_beli = Jumlah_beli;
    }
    
    
    
    void cetakInfo(){
        System.out.println("Harga_sapi :"+Harga_sapi);
        System.out.println("Jumlah_beli :"+Jumlah_beli);
    }
    
        Integer hitungTotal(){
            Integer Total;
            Total = Harga_sapi*Jumlah_beli;
            return Total;
            
    }
        
        void cetakTotal(){
            System.out.println("Totalnya adalah: "+hitungTotal());
            
        }
}
