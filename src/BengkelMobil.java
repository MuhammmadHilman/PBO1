public class BengkelMobil{

    private static Object begkel;
    private String namaBengkel;
    private int jumlahMontir;
    private boolean bengkelBuka;
    
    public BengkelMobil(String namaBengkel, int jumlahMontir){
        this.namaBengkel = namaBengkel;
        this.jumlahMontir = jumlahMontir;
        this.bengkelBuka = false;
    }
    
    public String getNamaBengkel(){
        return namaBengkel;
    }
    
    public void setNamaBengkel(String namaBengkel){
        this.namaBengkel = namaBengkel;
    }
    
    public int getJumlahMontir() {
        return jumlahMontir;
    }
    
    public void setJumlahMontir(int jumlahMontir){
        this.jumlahMontir = jumlahMontir;
    }
    
    public boolean isBengkelBuka(){
        return bengkelBuka;
    }
    
    public void setBengkelBuka(boolean bengkelBuka){
        this.bengkelBuka = bengkelBuka;
    }
    
    public void perbaikiMobil(String namaMontir, String jenisKerusakan){
        if (bengkelBuka){
            System.out.println("Montir" + namaMontir + "Sedang Memperbaiki mobildengan kerusakan: " + jenisKerusakan);
        } else {
            System.out.println("Maaf, bengkel sedang tutup.");
        }
    }
    
    public void terimaPesanan(String namaPemilik, String jenisMobil, String jenisKerusakan){
        System.out.println("Pesanan perbaikan dari" + namaPemilik + "Untuk Mobil: " + jenisMobil + "Dengan kerusakan:" + jenisKerusakan);
    }
    
    public void printInfoBengkel(){
        System.out.println("Nama Bengkel:" + namaBengkel);
        System.out.println("jumlah Montir:" + jumlahMontir);
        System.out.println("Status Bengkel:" + (bengkelBuka ? "Buka" : "Tutup"));
    }
    
    public static void main(String[] args){
        BengkelMobil bengkel = new BengkelMobil("Bengkel Sejahtera", 3);
        
        System.out.println("Informasi Bengkel: ");
        System.out.println("Nama Bengkel: " + bengkel.getNamaBengkel());
        System.out.println("Jumlah Montir: " + bengkel.getJumlahMontir());
        System.out.println("status Bengkel: "+(bengkel.isBengkelBuka() ? "Buka" : "Tutup"));
        
        bengkel.setBengkelBuka(true);
        
        System.out.println("\nMemperbaiki mobil...");
        bengkel.perbaikiMobil("Adi", "Mesin Overheat");
        
        System.out.println("\nMenerima pesanan perbaikian mobil...");
        bengkel.terimaPesanan("Budi", "Sedan", "Baterai Lemah");
        
        System.out.println("\nInformasi Bengkel Setelah Perbaikan:");
        bengkel.printInfoBengkel();
        
    }
    
}

