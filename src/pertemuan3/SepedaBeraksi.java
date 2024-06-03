
package pertemuan3;


public class SepedaBeraksi {
    public static void main(String[] args){
        Sepeda sepedaku = new Sepeda();
        
        sepedaku.setMerk ("Polygon");
        System.out.println("Merk Sepeda:" + sepedaku.getMerk());
        
        sepedaku.setGir(1);
        System.out.println("Gir saat ini:" + sepedaku.getGir());
        
        sepedaku.setGir(2);
        System.out.println("Posisi gir sepedaku:"+ sepedaku.getGir());
        
        sepedaku.setGir(5);
        System.out.println("Gir saat ini:" + sepedaku.getGir());
    }
    
}
    