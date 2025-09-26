package Modul_7;

public class MainKaryawan {
    public static void main(String[] args) {
        // Membuat objek karyawanTetap dari kelas KaryawanTetap
        // Parameter konstruktor: npp, nama, jumlahAnak, gajiPokok
        KaryawanTetap karyawanTetap = new KaryawanTetap(235314099, "Eugenius", 2, 5000000);

        // Menampilkan data Karyawan Tetap
        System.out.println("Data Karyawan Tetap:");
        // Menampilkan NPP
        System.out.println("NPP: " + karyawanTetap.npp);
        // Menampilkan Nama
        System.out.println("Nama: " + karyawanTetap.nama);
        // Menampilkan Gaji Total
        System.out.println("Gaji Total: " + karyawanTetap.hitungPendapatan());

        // Membuat objek karyawanKontrak dari kelas KaryawanKontrak
        // Parameter konstruktor: npp, nama, jumlahAnak, upahHarian, jumlahHariMasuk
        KaryawanKontrak karyawanKontrak = new KaryawanKontrak(235314098, "Fransisco", 1, 200000, 20);

        // Menampilkan data Karyawan Kontrak
        System.out.println("\nData Karyawan Kontrak:");
        // Menampilkan NPP
        System.out.println("NPP: " + karyawanKontrak.npp);
        // Menampilkan Nama
        System.out.println("Nama: " + karyawanKontrak.nama);
        // Menampilkan Upah Total
        System.out.println("Upah Total: " + karyawanKontrak.hitungPendapatan());
    }
}
