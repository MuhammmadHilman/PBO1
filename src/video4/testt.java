// 1. Bikin package latihan
package video4;

// 2. Bikin 1 class (bebas) [huruf pertama harus besar, ex: Hewan, Mobil]
// Class Mobil dengan atribut, konstruktor, dan metode accessor/mutator
public class testt {
    // 3. Bikin minimal 3 atribut
    private String merk;
    private String model;
    private int tahun;

    // 4. Bikin konstruktor tanpa parameter(ganti testt ke mobil)
    public testt() {
        this.merk = "Tidak Diketahui";
        this.model = "Tidak Diketahui";
        this.tahun = 0;
    }

    // 5. Bikin 1 konstruktor yang berisikan 3 nilai atribut
    public testt(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }

    // 6. Buatkan masing-masing yang berisi nilai method dan aksesornya (3 nilai atribut)
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Metode untuk menampilkan detail mobil
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
    }
}

// Class untuk MobilListrik yang memperluas class Mobil untuk mendemonstrasikan polimorfisme
class MobilListrik extends testt {
    private int kapasitasBaterai;

    public MobilListrik(String merk, String model, int tahun, int kapasitasBaterai) {
        super(merk, model, tahun);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    // Override metode tampilkanInfo untuk menyertakan kapasitas baterai
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " kWh");
    }
}

// 7. Buatkan 1 class untuk Main [huruf pertama harus besar, ex: Main]
// Main class untuk menguji fungsionalitas
class Main {
    // 8. Bikin void main
    public static void main(String[] args) {
        // 9. Buatkan 1 objek yang menginstansi class sebelumnya
        testt mobil1 = new testt();
        
        // 10. Tampilkan masing-masing atribut
        System.out.println("Mobil 1:");
        mobil1.tampilkanInfo();

        // 11. Buatkan 1 Objek untuk konstruktor dengan parameternya
        testt mobil2 = new testt("Toyota", "Camry", 2021);
        
        // 12. Polimorfisme
        testt mobil3 = new MobilListrik("Tesla", "Model S", 2022, 100);
        
        // 13. Tampilkan nilainya
        System.out.println("Mobil 2:");
        mobil2.tampilkanInfo();
        
        System.out.println("Mobil 3 (Mobil Listrik):");
        mobil3.tampilkanInfo();
    }
}
