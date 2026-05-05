/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS_PBO;
import java.util.Scanner;
/**
 *
 * @Ketua Muhamad Johan Putra Pratama (25104410007)
 * @anggota Gerry Atha Himawan (25104410012), Naura Luna Jasmine (25104410002), Ryz Nuzula A.N.A (25104410018)
 * Kelas = Teknik Informatika 2A
 */
public class ManajemenMahasiswa {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array of Object kapasitas maksimal 10
        Mahasiswa[] daftarMhs = new Mahasiswa[10];
        int jumlahMhs = 0;
        int pilihan;

        do {
            System.out.println("\n=== MENU MANAJEMEN MAHASISWA ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Mahasiswa yang Lulus (IPK >= 3.0)");
            System.out.println("5. Naikkan Semester Semua Mahasiswa");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    if (jumlahMhs < 10) {
                        System.out.print("Masukkan NIM: ");
                        String nim = input.nextLine();
                        if (nim.isEmpty()) {
                            System.out.println("Error: NIM tidak boleh kosong!");
                            break;
                        }

                        System.out.print("Masukkan Nama: ");
                        String nama = input.nextLine();

                        System.out.print("Masukkan Jurusan: ");
                        String jurusan = input.nextLine();

                        System.out.print("Masukkan Semester (1-8): ");
                        int sem = input.nextInt();
                        if (sem < 1 || sem > 8) {
                            System.out.println("Error: Semester harus antara 1-8!");
                            break;
                        }

                        System.out.print("Masukkan IPK (0.0-4.0): ");
                        double ipk = input.nextDouble();
                        if (ipk < 0.0 || ipk > 4.0) {
                            System.out.println("Error: IPK harus antara 0.0-4.0!");
                            break;
                        }

                        // Menggunakan Constructor Overloading (Semua Parameter)
                        daftarMhs[jumlahMhs] = new Mahasiswa(nim, nama, jurusan, sem, ipk);
                        jumlahMhs++;
                        System.out.println("Data berhasil ditambahkan.");
                    } else {
                        System.out.println("Kapasitas penuh!");
                    }
                    break;

                case 2:
                    System.out.println("\nDAFTAR SELURUH MAHASISWA:");
                    for (int i = 0; i < jumlahMhs; i++) {
                        // Menggunakan Method Overloading dengan Header
                        daftarMhs[i].tampilData(true);
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cariNim = input.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i < jumlahMhs; i++) {
                        if (daftarMhs[i].getNim().equals(cariNim)) {
                            daftarMhs[i].tampilData(true);
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) System.out.println("Data tidak ditemukan.");
                    break;

                case 4:
                    System.out.println("\nMAHASISWA YANG LULUS (IPK >= 3.0):");
                    for (int i = 0; i < jumlahMhs; i++) {
                        if (daftarMhs[i].isLulus()) {
                            daftarMhs[i].tampilData();
                        }
                    }
                    break;

                case 5:
                    for (int i = 0; i < jumlahMhs; i++) {
                        daftarMhs[i].naikSemester();
                    }
                    System.out.println("Semester semua mahasiswa telah diperbarui.");
                    break;

                case 6:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);

        input.close();
    }
}



