/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedapplication;

class Siswa{
    String nama;
    int umur;
    String kelas;
}

class Buku{
    String judul;
    String penulis;
    int tahunterbit;
}

public class siswa_buku {
    public static void main(String[] args){
        Siswa siswa1 = new Siswa();
        siswa1.nama = "Ani";
        siswa1.umur = 16;
        siswa1.kelas = "X IPA";
        
        Buku buku1 = new Buku();
        buku1.judul = "Matematika";
        buku1.penulis = "Budi";
        buku1.tahunterbit = 2022;
        
        System.out.println("Informasi Siswa");
        System.out.println("Nama:"+siswa1.nama);
        System.out.println("Umur:"+siswa1.umur);
        System.out.println("Kelas:"+siswa1.kelas);
        
        System.out.println("Informasi Buku");
        System.out.println("Judul:"+buku1.judul);
        System.out.println("Penulis:"+buku1.penulis);
        System.out.println("Tahun Terbit:"+buku1.tahunterbit);
    }
}
