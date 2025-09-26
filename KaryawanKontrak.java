package Modul_7;

// Kelas KaryawanKontrak yang merupakan subclass dari kelas Karyawan
public class KaryawanKontrak extends Karyawan {
    // Atribut upahHarian
    public int upahHarian;

    // Atribut jumlahHariMasuk
    public int jumlahHariMasuk;

    // Konstruktor KaryawanKontrak yang menerima parameter npp, nama, jumlahAnak,
    // upahHarian, dan jumlahHariMasuk
    // Parameter upahHarian dan jumlahHariMasuk digunakan untuk menginisialisasi
    // atribut khusus dari KaryawanKontrak
    public KaryawanKontrak(int npp, String nama, int jumlahAnak, int upahHarian, int jumlahHariMasuk) {
        // Memanggil konstruktor dari kelas induk (Karyawan) dengan parameter npp, nama,
        // dan jumlahAnak
        super(npp, nama, jumlahAnak);

        // Inisialisasi atribut upahHarian dengan nilai parameter upahHarian
        this.upahHarian = upahHarian;

        // Inisialisasi atribut jumlahHariMasuk dengan nilai parameter jumlahHariMasuk
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    // Metode hitungPendapatan yang menghitung total pendapatan Karyawan Kontrak
    // mengembalikan hasil penjumlahan dari hasil perkalian upahHarian dengan
    // jumlahHariMasuk
    // ditambah dengan hasil metode hitungTunjangAnak() dari kelas induk (Karyawan)
    public int hitungPendapatan() {
        return (upahHarian * jumlahHariMasuk) + hitungTunjangAnak();
    }
}
