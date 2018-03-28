package praktek2;
public class Rectangle {
    Integer Harga_sapi;
    Integer Jumlah_beli;
    
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
