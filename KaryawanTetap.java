package Modul_7;

// Kelas KaryawanTetap yang merupakan subclass dari kelas Karyawan
public class KaryawanTetap extends Karyawan {
    // Atribut gajiPokok 
    public int gajiPokok;

    // Konstruktor KaryawanTetap yang menerima parameter npp, nama, jumlahAnak, dan gajiPokok
    // menggunakan 'super' untuk memanggil konstruktor dari kelas induk (Karyawan)
    // Parameter gajiPokok digunakan untuk menginisialisasi atribut khusus dari KaryawanTetap
    public KaryawanTetap(int npp, String nama, int jumlahAnak, int gajiPokok) {
        // Memanggil konstruktor dari kelas induk (Karyawan) dengan parameter npp, nama, dan jumlahAnak
        super(npp, nama, jumlahAnak);
        
        // Inisialisasi atribut gajiPokok dengan nilai parameter gajiPokok
        this.gajiPokok = gajiPokok;
    }

    // Metode hitungPendapatan yang menghitung total pendapatan Karyawan Tetap
    // Metode ini mengembalikan hasil penjumlahan dari gajiPokok
    // ditambah dengan hasil metode hitungTunjangAnak() dari kelas induk (Karyawan)
    public int hitungPendapatan() {
        return gajiPokok + hitungTunjangAnak();
    }
}

