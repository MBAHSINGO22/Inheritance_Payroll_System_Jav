package Modul_7;

public class Karyawan {
    // Atribut npp
    public int npp;

    // Atribut nama
    public String nama;

    // Atribut jumlahAnak
    public int jumlahAnak;

    // Konstanta subsidiPerAnak yang menunjukkan subsidi per anak
    public static final int subsidiPerAnak = 100000;

    // Konstruktor Karyawan yang menerima parameter npp, nama, dan jumlahAnak
    // Konstruktor digunakan untuk membuat objek baru dari kelas Karyawan
    public Karyawan(int npp, String nama, int jumlahAnak) {
        // Inisialisasi atribut npp dengan nilai parameter npp
        this.npp = npp;

        // Inisialisasi atribut nama dengan nilai parameter nama
        this.nama = nama;

        // Inisialisasi atribut jumlahAnak dengan nilai parameter jumlahAnak
        this.jumlahAnak = jumlahAnak;
    }

    // Metode hitungTunjangAnak yang menghitung total tunjangan anak berdasarkan
    // jumlah anak dan subsidi per anak
    public int hitungTunjangAnak() {
        // mengembalikan hasil perkalian jumlah anak dengan subsidi per anak
        return jumlahAnak * subsidiPerAnak;
    }
}
