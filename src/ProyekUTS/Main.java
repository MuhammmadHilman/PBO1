package ProyekUTS;

public class Main {
    public static void main(String[] args ){
        Mahasiswa mahasiswa = new Mahasiswa("Budi", "123456", 90);
        MahasiswaLulus mahasiswaLulus = new MahasiswaLulus("Budi", "662134", 95, "20 Mei 2024");
        
        tampilkanInformasiMahasiswa(mahasiswa);
        tampilkanInformasiMahasiswa(mahasiswaLulus);
    }
    
    public static void tampilkanInformasiMahasiswa(Mahasiswa mahasiswa) {
        mahasiswa.tampilkanInfo();
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    private int nilai;
    
    public Mahasiswa(String nama, String nim, int nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai: " + nilai);
        
    }
    
    public void setNilai(int nilai){
        this.nilai = nilai;
    }
    
    public int getNilai() {
        return nilai;
    } 
}

class MahasiswaLulus extends Mahasiswa {
    private String tanggalLulus;
    
    public MahasiswaLulus(String nama, String nim, int nilai, String tanggalLulus){
        super(nama, nim, nilai);
        this.tanggalLulus = tanggalLulus;
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Lulus: " + tanggalLulus);
    }
}