package model;

public class Mahasiswa {
    private String nim;
    public String getNim() {
        return nim;
    }
    private String nama;
    public String getNama() {
        return nama;
    }
    private String idProdi;  
    public String getIdProdi() {
        return idProdi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIdProdi(String idProdi) {
        this.idProdi = idProdi;
    }

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
}