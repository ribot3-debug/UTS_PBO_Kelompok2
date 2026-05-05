/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS_PBO;

/**
 *
 * @Ketua Muhamad Johan Putra Pratama (25104410007)
 * @anggota Gerry Atha Himawan (25104410012), Naura Luna Jasmine (25104410002), Ryz Nuzula A.N.A (25104410018)
 * Kelas = Teknik Informatika 2A
 */
public class Mahasiswa {
    
     // Atribut private (Encapsulation)
    private String nim;
    private String nama;
    private String jurusan;
    private int semester;
    private double ipk;

    // --- CONSTRUCTOR OVERLOADING ---
    
    // 1. Constructor Default
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.jurusan = "";
        this.semester = 1;
        this.ipk = 0.0;
    }

    // 2. Constructor dengan NIM dan Nama
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = "Belum Diisi";
        this.semester = 1;
        this.ipk = 0.0;
    }

    // 3. Constructor Lengkap (Semua Parameter)
    public Mahasiswa(String nim, String nama, String jurusan, int semester, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.semester = semester;
        this.ipk = ipk;
    }

    // --- METHOD OVERLOADING ---

    // 1. Method tampilData tanpa parameter
    public void tampilData() {
        System.out.println("NIM      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Semester : " + semester);
        System.out.println("IPK      : " + ipk);
        System.out.println("Status   : " + (isLulus() ? "Lulus" : "Belum Lulus"));
        System.out.println("---------------------------");
    }

    // 2. Method tampilData dengan parameter boolean
    public void tampilData(boolean denganHeader) {
        if (denganHeader) {
            System.out.println("=== DATA MAHASISWA ===");
        }
        tampilData(); // Memanggil method tampilData dasar
    }

    // --- METHOD TAMBAHAN ---

    public boolean isLulus() {
        return this.ipk >= 3.0;
    }

    public void naikSemester() {
        if (this.semester < 8) {
            this.semester++;
        } else {
            System.out.println("Mahasiswa " + nama + " sudah mencapai semester maksimal (8).");
        }
    }

    // --- GETTER DAN SETTER ---
    
    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getJurusan() { return jurusan; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }

    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }

    public double getIpk() { return ipk; }
    public void setIpk(double ipk) { this.ipk = ipk; }
}





