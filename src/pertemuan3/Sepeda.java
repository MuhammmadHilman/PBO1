package pertemuan3;


public class Sepeda {
    int gir;
    String merk;
    String setMerk;
    
    void setGir(int pertambahanGir){
        gir = gir + pertambahanGir;
        
    }
    
    void setMerk (String merkSepeda){
        merk = merkSepeda;
    }
    
    int getGir(){
        return gir;
    }
    
    String getMerk(){
        return merk;
    }

 
}

